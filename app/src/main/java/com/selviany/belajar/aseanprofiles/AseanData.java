package com.selviany.belajar.aseanprofiles;

import java.util.ArrayList;

public class AseanData {

    public static String[] dataCountry = {
            "Indonesia", "Malaysia", "Thailand", "Filipina", "Singapura", "Brunei Darussalam", "Vietnam", "Laos", "Myanmar", "Kamboja"
    };

    public static String[] dataDetail = {
            "Indonesia merupakan salah satu negara yang berpengaruh, khususya di wilayah Asia Tenggara. Hal itu yang menjadikan Indonesia salah satu pelopor berdirinya ASEAN.",
            "Malaysia adalah salah satu perintis ASEAN dan turut serta diberbagai organisasi internasional.",
            "Selain sebagai pelopor berdirinya ASEAN, Thailand juga menjadi negara dimana ASEAN dibentuk tepatnya pada 8 Agustus 1967 di lapangan golf, di Bangsan.",
            "Sebagai salah satu pendiri ASEAN, Filipina ikut serta dalam kerjasama politik dan aktif di bidang ekspor dan impor.",
            "Singapura merupakan salah satu pendiri ASEAN. Singapura merupakan negara penghasil industri paling tinggi di ASEAN.",
            "Sebagai penghasil minyak bumi dan gas alam terbesar, Brunei Darussalam berperan sebagai roda jual beli minyak bumi di ASEAN.",
            "Vietnam merupakan negara ketujuh yang masuk ASEAN. Masuknya Vietnam membawa perubahan yang cukup baik terutama dalam menjaga stabilitas keamanan dan perdamaian antar negara ASEAN.",
            "Sebagai negara yang diapit oleh negara-negara anggota komunitas ASEAN, Laos menjadi salah satu kunci dalam kegiatan diplomasi di kawasan ASEAN.",
            "Myanmar merupakan negara kesembilan yang bergabung dengan ASEAN. Dalam perannya, Myanmar mendesak kesepakatan untuk meningkatkan peran perempuan dan anak-anak di kawasan ASEAN.",
            "kamboja menjadi negara terakhir yang bergabung dengan ASEAN. Pertemuan para pejabat senior anggota ASEAN di kamboja tahun 2012 mengawali keketuaan kamboja untu ASEAN."
    };
    public static String[] dataDate = {
            "8 Agustus 1967(Negara Pendiri)","8 Agustus 1967(Negara Pendiri)","8 Agustus 1967(Negara Pendiri)","8 Agustus 1967(Negara Pendiri)","8 Agustus 1967(Negara Pendiri)","7 Januari 1984","28 Juli 1995","23 Juli 1997","23 Juli 1997","16 Desember 1998"
    };

    public static String[] dataCapital = {
            "Jakarta", "Kuala Lumpur", "Bangkok", "Manila", "Singapura", "Bandar Seri Begawan", "Hanoi", "Vientiane", "Rangoon(Yamar)", "Phnom Penh"
    };

    public static String[] dataLand = {
            "1.904.569 km2","329.847 km2","513.120 km2","300.000 km2","697 km2","5.765 km2","331.210 km2","236.800 km2","676.578 km2","181.035 km2"
    };

    public   static String[] dataPopulation = {
            "262.787.403 jiwa","31.809.660 jiwa","68.615.858 jiwa","105.893.381 jiwa","5.995.991 jiwa","450.565 jiwa","97.040.334 jiwa","7.234.171 jiwa","55.622.506 jiwa","16.449.519 jiwa"
    };

    public static String[] dataLanguage = {
            "Indonesia","Melayu","Thai","Tagalog dan Inggris","Inggris, Melayu,Mandarin dan Tamil","Melayu","Vietnam","Lao","Myanmar","Khmer"
    };

    public static String[] dataCurrency = {
            "Rupiah","Ringgit","Baht","Peso","Dollar Singapura","Dollar Brunei","Dong","Kip Laos","Kyat","Riel"
    };

    public static int[] dataImages = {
            R.drawable.indonesia,R.drawable.malaysia,R.drawable.thailand,R.drawable.filipina,R.drawable.singapura,R.drawable.brunei,R.drawable.vietnam,R.drawable.laos,R.drawable.myanmar,R.drawable.kamboja
    };

    public static ArrayList<Asean> getListData() {
        Asean asean;
        ArrayList<Asean> list = new ArrayList<>();

        for (int position = 0; position < dataImages.length; position++){
            asean = new Asean();
            asean.setCountry(dataCountry[position]);
            asean.setDesc(dataDetail[position]);
            asean.setDate(dataDate[position]);
            asean.setCapital(dataCapital[position]);
            asean.setLand(dataLand[position]);
            asean.setPopulation(dataPopulation[position]);
            asean.setLanguage(dataLanguage[position]);
            asean.setCurrency(dataCurrency[position]);
            asean.setImages(dataImages[position]);

            list.add(asean);
        }
        return list;
    }
}
