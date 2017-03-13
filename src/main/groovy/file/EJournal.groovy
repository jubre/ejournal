package file

/**
 * Created by junior on 12/03/17.
 */
class EJournal {
    String pathName
    String initialAudit
    String lastAudit

    EJournal(pathName) {
        this.pathName = pathName
        initialAudit = ""
        lastAudit = ""
    }

    def processEJournal() {
        File file = new File(pathName)

        /*
        println "The file ${file.absolutePath} has ${file.length()} bytes"

        def lineNo = 1
        def line
        file.withReader { reader ->
            while ((line = reader.readLine()) != null) {
                println "${lineNo}. ${line}"
                lineNo++
            }
        }*/

        def line, count = 1, MAXSIZE = 4
        file.withReader { reader ->
            while (line = reader.readLine()) {
                if (count < MAXSIZE) {
                    initialAudit += line
                } else {
                    break
                }
                count++
            }
        }
    }
}
