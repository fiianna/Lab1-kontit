public class Estekisat {

    private boolean osallistujatPaikalla = true;

    public void jaaKilpailijanumerot(boolean jako) {
        if (jako && osallistujatPaikalla) {
            kilpailijatValmiita ();
        }
    }
