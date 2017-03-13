package file

import org.junit.Test

/**
 * Created by junior on 12/03/17.
 */
import static org.junit.Assert.assertEquals

class EJournalTest {

    @Test
    void indexOutOfBoundsAccess() {
        def eJournal = new EJournal("journal.data")
        eJournal.processEJournal()

        assertEquals("INIT AUDITORIA 1INIT AUDITORIA 2INIT AUDITORIA 3", eJournal.initialAudit)
    }
}
