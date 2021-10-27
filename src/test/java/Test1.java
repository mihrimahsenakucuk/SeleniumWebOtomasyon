import org.testng.annotations.Test;

public class Test1{
    Anasayfa anaSayfa;
    Urunsayfası urunsayfası;
    UrunDetaySayfasi urunDetaySayfasi;
    SepetSayfası sepetSayfası;

    @Test
    public void urun_arama(){
        anaSayfa.aramaCubugu().search("pantolon");
        Assertions.assertTrue(urunsayfası.isOnUrunSayfası() , "Ürün sitede bulunmamaktadır.");

    }

    @Test
    public void click_urun(){
        urunsayfası.selectUrun(3);
        Assertions.assertTrue(urunsayfası.isOnUrunDetaySayfasi() , "Ürün detay sayfası bulunmuyor.");
    }

    @Test
    public void sepete_ekle(){
        urunDetaySayfasi.ekle();
        Assertions.assertTrue(anaSayfa.urunekleme() , "Ürün eklenmedi ");
    }

    @Test
    public void sepete_git(){
        anaSayfa.sepeteGit();
        Assertions.assertTrue(sepetSayfası.uruneklemekontrolu() ,"Ürün sepete eklenmedi.");
    }


}
