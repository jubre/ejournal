/**
 * Created by junior on 12/03/17.
 */
class FileExample {
    static void main(String[] args) {
            File file = new File("journal.data")
            println "The file ${file.absolutePath} has ${file.length()} bytes"
        }
}
