package file
/**
 * Created by junior on 12/03/17.
 */
class RunEJournal {
    static void main(String[] args) {
        def eJournal = new EJournal("journal.data")
        eJournal.processEJournal()

        println eJournal.initialAudit
    }
}
