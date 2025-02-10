builds = [:]

builds.put("build_1", build("test"))
builds.put("build_2", build("test"))

writer = new StringWriter()
builder = new groovy.xml.MarkupBuilder(writer)

builder.testsuite(tests: builds.size()) {
    for (bld in builds) {
        def buildName = bld.key
        def numberOfBuild = hudson.console.HyperlinkNote.encodeTo("/" + bld.value.getUrl(),
                String.valueOf(bld.value.getDisplayName()))
        def statusOfBuild = hudson.console.HyperlinkNote.encodeTo('/' + bld.value.getUrl()
                + "console", bld.value.result.toString())

        if (statusOfBuild.contains("FAILURE")) {
            testcase(name: "$buildName", build_number: "$numberOfBuild") {
                failure()
            }
        } else {
            testcase(name: "$buildName", build_number: "$numberOfBuild")
        }

        build.setResult(build.result.combine(bld.value.result))
    }
}

def result = writer.toString()
writer.flush()
writer.close()
println result

//def file = new File("report.xml")
//file << result

if (build.workspace.isRemote()) {
    channel = build.workspace.channel
}
String fp = build.workspace.toString() + "\\" + "report.xml"
//newFile = new hudson.FilePath(channel, fp)
//newFile.write("xyz", result)


build.workspace.child("file.xml").write(result, "UTF-8")
