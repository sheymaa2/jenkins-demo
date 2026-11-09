package ma.ensa.jenkins.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class etudiantManipTest {
    @Test
    void emailCorrect_valide()
    {
        assertTrue(etudiantManip.verifyBackendInsertionMail("omar.elhorre@etu.ma"));
    }
    @Test
    void emailSansArobase_invalide()
    {
        assertFalse(etudiantManip.verifyBackendInsertionMail("amina.test.etu.ma"));
    }

    @Test
    void emailSansDomaine_invalide()
    {
        assertFalse(etudiantManip.verifyBackendInsertionMail("amina@"));
    }

    @Test
    void emailVide_invalide()
    {
        assertFalse(etudiantManip.verifyBackendInsertionMail(""));
    }

    @Test
    void CINCorrecte_valide()
    {
        assertTrue(etudiantManip.verifyBackendInsertionCIN("BL175906"));
    }
    @Test
    void CINCorrecte_valide2()
    {
        assertTrue(etudiantManip.verifyBackendInsertionCIN("B015906"));
    }
    @Test
    void CINCorrecte_invalide_pasDeLettre()
    {
        assertFalse(etudiantManip.verifyBackendInsertionCIN("00175906"));
    }
    @Test
    void CINCorrecte_invalideLessChar()
    {
        assertFalse(etudiantManip.verifyBackendInsertionCIN("0906"));
    }

    @Test
    void Appoge_valide() {
        assertTrue(etudiantManip.verifyAppogee(12345678));
    }
    @Test
    void Appoge_invalide()
    {
        assertFalse(etudiantManip.verifyAppogee(196112));
    }


}
