package com.mubassyir.submission1jetpack.utils

import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.data.MovieEntity
import com.mubassyir.submission1jetpack.data.TvShowEntity
import com.mubassyir.submission1jetpack.ui.movie.MovieViewModel
object Data {

    fun generateMovieData():List<MovieEntity> {

        val movieEntity= ArrayList<MovieEntity>()

        movieEntity.add(
            MovieEntity(0,
                "A STAR",
                "4.6 from 5",
                "5/5/2019",
                "jack yang merupakan seorang alkoholik kala itu baru saja menyelesaikan konser musiknya." +
                        " Diperjalanan pulang, ia meminta supirnya untuk menepi di sebuah bar karena ia kehabisan" +
                        " minuman beralkohol di mobilnya. Kebetulan sekali di bar tempat ia minum, sedang" +
                        " ada pertunjukkan live music di mana para penyanyinya berdandan layaknya drag queen." +
                        " Awalnya Jack tidak terlalu peduli dengan lingkungan sekitarnya, hingga akhirnya ada" +
                        " seorang penyanyi yang suara dan penampilannya berhasil mencuri perhatian Jack",
                R.drawable.poster_a_star)
        )

        movieEntity.add(
            MovieEntity(1,
                "AQUAMAN",
                "4.6 from 5",
                "5/5/2019",
                "salah satu karakter superhero DC akan mendapat porsi besar dalam film AQUAMAN yang"+
                        " siap tayang di bioskop mulai tanggal 12 Desember 2018. Digadang-gadang sebagai film DC" +
                        " terbaik setelah trilogi Batman, AQUAMAN akan menguak lebih dalam soal kehidupan sebenarnya" +
                        " dari Arthur Curry.Dalam ceritanya, Arthur Curry yang diperankan oleh Jason Momoa adalah anak dari seorang penjaga" +
                        " mercusuar dan dewi laut.Meski memiliki darah dari kehidupan kerajaan Atlantis, Arthur memilih" +
                        " untuk hidup sebagai manusia biasa di daratan." +
                        " Sampai akhirnya, Arthur bertemu dengan salah satu penghuni bawah laut, Hera (Amber Heard)" +
                        " yang mengatakan kalau umat manusia dalam bahaya karena ambisi saudara tiri Arthur",
                R.drawable.poster_aquaman)
        )

        movieEntity.add(
            MovieEntity(2,
                "AVENGER INVINITY",
                "4.6 from 5",
                "5/5/2019",
                "Thanos (Josh Brolin) berambisi untuk mengumpulkan enam batu abadi yang tersebar di berbagai" +
                        " tempat. Setiap batu memiliki kekuatan tersendiri sehingga tidak sembarang orang bisa" +
                        " mendapatkannya." +
                        " jika sudah memiliki keenam batu abadi, Thanos bisa menjadi penguasa semesta. Thanos pun" +
                        " berniat menghilangkan separuh populasi semesta karena dipercaya bisa membuat kehidupan lebih sejahtera." +
                        " Thanos bersama anak buahnya menebar teror sambil mencari batu-batu tersebut. Kekejaman" +
                        " Thanos disaksikan sendiri oleh Bruce Banner Hulk (Mark Ruffalo) dan Thor (Chris Hemsworth)." +
                        " Mereka berniat menemukan superhero lain agar bisa mencegah ambisi Thanos." +
                        " Hulk kembali ke bumi dan memberi tahu aksi Thanos kepada Tony Stark Iron Man" +
                        " (Robert Downey Jr.), Doctor Strange (Benedict Cumberbatch) serta Wong (Benedict Wong)",
                R.drawable.poster_avengerinfinity)
        )

        movieEntity.add(
            MovieEntity(3,
                "BIRDBOX",
                "4.6 from 5",
                "5/5/2019",
                "Menambah list deretan film post-apocalyptic, hadir film BIRD BOX yang menceritakan" +
                        " tentang teror misterius kepada penduduk dunia yang mengakibatkan bunuh diri masal." +
                        " Setelah menyerang Siberia dan menyebar ke berbagai belahan Eropa, kejadian misterius itu" +
                        " akhirnya menyerang warga Amerika." +
                        " Malorie Hayes (Sandra Bullock), seorang seniman yang tengah mengandung sedang memeriksakan" +
                        " diri ke dokter bersama kakak perempuannya Jessica (Sarah Paulson). Dalam perjalanan pulang," +
                        " keduanya melihat terjadi kekacauan di luar hingga banyak orang melakukan bunuh diri. Di saat" +
                        " yang sama, Jessica kemudian terlihat aneh hingga akhirnya bunuh diri di depan mata Malorie",
                R.drawable.poster_birdbox)
        )
        movieEntity.add(
            MovieEntity(4,
                "BOHEMIAN",
                "4.6 from 5",
                "5/5/2019",
                "Pecinta musik pastinya sudah tak asing lagi dengan lagu Bohemian Rhapsody. Yap lagu itu" +
                        " dipopulerkan oleh band asal Inggris, Queen, pada tahun 1975. Film BOHEMIAN RHAPSODY sendiri" +
                        " berkisah tentang frontman alias vokalis dari band legendaris tersebut Freddie Mercury yang" +
                        " kali ini diperankan oleh Rami Malek." +
                        " Film ini digarap oleh sutradara Bryan Singer. Kita bukan hanya akan melihat tentang betapa" +
                        " wah-nya Freddy Mercury dalam dunia musik, tapi juga diajak untuk melihat awal kehidupan" +
                        " Freddy yang punya nama asli Farrokh Bulsara." +
                        " Buat pecinta Queen, tentu saja film ini harus ditonton, karena banyak lagu top dari band" +
                        " ini yang akan dihadirkan. Bukan cuma Bohemian Rhapsody saja pastinya",
                R.drawable.poster_bohemian)
        )

        movieEntity.add(
            MovieEntity(5,
                "BUMBlE BEE",
                "4.6 from 5",
                "5/5/2019",
                "Pecinta film seri TRANSFORMERS pastinya nggak boleh melewatkan BUMBLEBEE. Film tentang" +
                        " Autobot kuning muda yang punya nama asli B-127 dari planet Cybertron ini menceritakan" +
                        " tentang pertama kali dia ke bumi untuk melaksanakan sebuah misi yang diberikan oleh pemimpinnya," +
                        " Optimus Prime." +
                        " B-127 tiba di bumi tahun 1987 dan terdampar di California saat Sector 7 (badan rahasia pemerintah" +
                        " Amerika Serikat yang memantau aktivitas di luar angkasa) sedang melakukan pelatihan. Sector 7" +
                        " menganggap B-127 sebagai musuh dan membawanya ke hutan." +
                        " Saat menuju hutan, Blitzwing, bagian dari Decepticons (musuh Autobots) menghentikan mereka" +
                        " dan melawan B-127. Si kuning menolak memberitahukan keberadaan Optimus Prime. Blitzwing lalu" +
                        " merusak voicebox dan bagian memori dari B-127",
                R.drawable.poster_bumblebee)
        )

        movieEntity.add(
            MovieEntity(6,
                "CREED",
                "4.6 from 5",
                "5/5/2019",
                "Creed 2 menceritakan pertarungan keren dari Adonis Creed yang membuatnya menjadi juara tinju" +
                        "dunia. Hidupnya pun sangat sempurna karena tak hanya memiliki gelar, ia akhirnya bisa menikah" +
                        "dengan wanita pujaannya Bianca." +
                        "Alur cerita film Creed 2 mudah diikuti meski belum menonton film pertama Creed. Karakter penting" +
                        "dalam film ini akan diceritakan secara gamblang sehingga penonton semakin mudah mencerna isi" +
                        "cerita Creed 2.Ada yang menarik dari film ini karena masa lalu dari Adonis Creed dan Rocky Balboa" +
                        "akan muncul kembali. Mereka kembali dihadapkan dengan Ivan Drago (Dolph Lundgren) seorang petinju" +
                        "yang dulu menewaskan ayah Adonis Creed",
                R.drawable.poster_creed)
        )

        movieEntity.add(
            MovieEntity(7,
                "DEADPOOL",
                "4.6 from 5",
                "5/5/2019",
                "DEADPOOL 2 adalah salah satu film yang ditunggu-tunggu pekan ini oleh moviegoers Indonesia." +
                        "Setelah sukses dengan film pertama di tahun 2016, Ryan Reynolds akhirnya kembali dengan perannya" +
                        "yang fenomenal Wade Wilson alias Deadpool yang kocak tapi juga hot dan pastinya bisa diandalkan." +
                        "Kalau di film pertama kita melihat proses bagaimana Wade Wilson menjadi Deadpool dan perjuangannya" +
                        "demi cintanya, kini kita bisa melihat aksinya dalam menyelamatkan mutan lainnya di sekuel ini." +
                        "DEADPOOL 2 memiliki kisah inti yaitu Deadpool berusaha untuk melindungi mutan muda misterius" +
                        "bernama Russel (Julian Dennisson). Russel diincar oleh seorang tentara yang bisa time" +
                        "traveling bernama Cable (Josh Brolin). Untuk mencapai misinya ini Deadpool pun membentuk" +
                        "tim yang lalu diberi nama X-Force",
                R.drawable.poster_deadpool)
        )
        movieEntity.add(
            MovieEntity(8,
                "DRAGON",
                "4.6 from 5",
                "5/5/2019",
                "Franchise ketiga dari HOW TO TRAIN YOUR DRAGON sebentar lagi sudah bisa dinikmati oleh" +
                        "para pecinta film animasi di Indonesia. Berbeda dari dua film sebelumnya, HOW TO TRAIN YOUR" +
                        "DRAGON 3 akan diberi sub judul THE HIDDEN WORLD." +
                        "Nggak salah lagi, sesuai dengan judulnya, film ini akan kembali mengisahkan petualangan" +
                        "Hiccup (Jay Baruchel) dan naga imut miliknya Night Furry dalam mencari dunia rahasia yang" +
                        "selama ini dianggap mitos",
                R.drawable.poster_dragon)
        )
        movieEntity.add(
            MovieEntity(9,
                "DRAGONBALL",
                "4.6 from 5",
                "5/5/2019",
                "Bagi para penggemar Dragon Ball, kini akan ada kabar gembira di bulan Februari ini." +
                        "Film garapan Toei Animation, Dragon Ball Super: Broly akan tayang di bioskop Indonesia pada 20 Februari 2019 mendatang." +
                        "Bioskop CGV Cinemas telah mengumumkan jadwal pemutaran film yang berdurasi 100 menit tersebut."+
                        "Sebelum menyaksikan film terlaris Dragon Ball ini, simak dulu sinopsisnya." +
                        "Meski film ini adalah penampilan keempat Broly dalam film fitur, film ini akan mempertemukan Goku, Vegeta, " +
                        "dan Frieza melawan Legendary Super Saiyan Broly.",
                R.drawable.poster_dragonball)
        )
        return movieEntity
    }

    fun generateTvShowData():List<TvShowEntity>{
        val tvShowEntitiy = ArrayList<TvShowEntity>()

        tvShowEntitiy.add(
            TvShowEntity(0,
                "GLASS",
                "4.4 from 5",
                "5/5/2019",
                "Dari trailer-nya, David Dunn, Elijah Price  dan sang psikopat Kevin Wendell berada dalam " +
                        "sebuah tempat yang mungkin saja bisa disebut sebagai pusat rehabilitasi. Namun, " +
                        "yang menjadi pertanyaan adalah siapa yang mengincar siapa? David Dunn seperti terlihat " +
                        "ingin menyelesaikan sebuah masalahnya dengan The Beast, salah satu kepribadian milik Kevin." +
                        "Sementara itu Elijah Price yang dikenal memiliki IQ diatas rata-rata berada di tengah-" +
                        "tengahnya, berusaha tampil sebagai sosok misterius yang diklaim memegang rahasia Dunn " +
                        "maupun Kevin. Namun, Elijah Price tampaknya ikut terlibat dalam kekacuaan yang membuat " +
                        "suasana di sebuah fasilitas rehabilitasi menjadi berantakan." +
                        "Lalu, apa sebenarnya tujuan dari masing-masing karakterkter ini? Siapa Elijah Price " +
                        "sebenarnya? Bagaimana David Dunn memperoleh kekuatannya? Lalu, apa latar belakang " +
                        "Kevin bisa memiliki kepribadian yang jumlahnya tidak terhingga. Semuanya mungkin " +
                        "saja akan terungkap di film Glass." +
                        "Buat kamu yang belum memahami sosok Elijah Price alias Mr. Glass dan David Dunn, " +
                        "BookMyShow akan sedikit mengungkapkan pertemuan mereka di film Unbreakable. ",
                R.drawable.poster_glass
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(1,
                "HUNTER KILLER",
                "4.4 from 5",
                "5/5/2019",
                "Hunter Killer adalah nama bagi kapal selam AS. Film ini sendiri diangkat dari novel fiksi " +
                        "Firing Point (2012) karya George Wallace dan Don Keith. Wallace adalah mantan komandan " +
                        "di Navy Seals yang berpengalaman selama 22 tahun di kapal selam nuklir. Cerita film " +
                        "ini bermula di kedalaman laut Barent, yang berada di perairan Rusia. Sebuah kapal " +
                        "selam pimpinan Kapten Joe Glass (Gerard Butler) tengah menyelidiki insiden tenggelamnya " +
                        "kapal selam USS Tampa Bay. Glass menemukan fakta adanya keganjilan atas tenggelamnya " +
                        "kapal selam USS Tampa Bay.",
                R.drawable.poster_hunterkiller
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(2,
                "MARRYPOPINS",
                "4.4 from 5",
                "5/5/2019",
                "MARY POPPINS, sebuah film musikal Amerika yang menggabungkan unsur fantasi di dalamnya akhirnya kembali! " +
                        "Yup, film yang pertama kali dirilis tahun 1964 ini dibuat ulang dengan sentuhan yang lebih moderen " +
                        "dan pastinya sangat menghibur. Dilansir dari NY Times.com yang terbit kemarin (17/9), versi terbaru " +
                        "dari film ini berjudul MARY POPPINS RETURNS." +
                        "Dikisahkan ada sepasang suami-istri (Michael dan Jane Banks) sedang membersihkan barang-barang " +
                        "lama dari loteng rumahnya. Di sana sang istri menemukan sebuah layang-layang tua yang dulu pernah " +
                        "ia mainkan bersama ayah dan ibunya. Karena sudah usang dan terdapat robek di sana-sini, layang-layang " +
                        "itu pun dibuang ke tempat sampah.",
                R.drawable.poster_marrypopins
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(3,
                "MORTAL ENGINE",
                "4.4 from 5",
                "5/5/2019",
                "Mortal Engines akan mengisahkan Hester Shaw (Hera Hilmar), yang merupakan karakter utama film " +
                        "ini dan merupakan seorang pembunuh bayaran yang ingin membalas dendam atas kematian " +
                        "ibunya. Terdapat juga tokoh Tom Natsworthy (Robert Sheehan) seorang sejarawan baik di " +
                        "London yang monolitik, dan Thaddeus Valentine (Hugo Weaving) yang merupakan kepala gilda " +
                        "sejarawan dan penjahat utama dari cerita ini. Hester memiliki dendam pribadi dengan " +
                        "penguasa London bernama Thaddeus Valentine, namun upayanya sendiri dalam melangsungkan " +
                        "niatnya tidaklah mudah. Akhirnya Hester dan Tom kemudian bergabung dengan pasukan " +
                        "anti-traksi yang dikomandoi oleh Anna Fang (Jihae), seorang penjahat yang berbahaya. " +
                        "Mereka pun merencanakan misi pemberontakan untuk melawan kota predator raksasa yang " +
                        "bergerak.",
                R.drawable.poster_mortalengine
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(4,
                "PREMAN",
                "4.4 from 5",
                "5/5/2019",
                "Sinetron Preman Pensiun adalah salah satu acara yang mampu menghibur masyarakat Indonesia saat " +
                        "tayang di RCTI. Kisah tentang Kang Bahar (almarhum Didi Petet) mantan preman yang punya " +
                        "banyak anak buah dan memutuskan pensiun di masa tuanya. Kini kisah inspiratif nan kocak " +
                        "itu ada versi film yang siap ditonton di bioskop." +
                        "PREMAN PENSIUN versi film mengambil setting waktu tiga tahun setelah meninggalnya Kang " +
                        "Bahar. Setelah beliau meninggal, kepemimpinan para preman pensiun ini dipegang oleh Kang " +
                        "Mus (Epy Kusnandar). Di masa pensiun mereka memutuskan untuk berbisnis. Bisnis yang bagus " +
                        "tapi bukan bisnis yang baik, kalau kata Kang Mus. Bikin bingung juga ya.",
                R.drawable.poster_preman
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(5,
                "ROBINHOOD",
                "4.4 from 5",
                "5/5/2019",
                "Film Robin Hood (2018) telah mulai tayang di bioskop Indonesia. Film yang terakhir di-remake pada " +
                        "2010 ini akan kembali menampilkan cerita petualangan Robin Hood, seorang pahlawan dalam " +
                        "legenda cerita rakyat Inggris. Berdasarkan sejarahnya, Robin Hood adalah seorang tentara " +
                        "Salib yang memiliki keahlian memanah. Dalam film, Robin Hood akan melancarkan pemberontakan " +
                        "terhadap petinggi di kerajaan Inggris. Ia beserta komandan Moornya akan mengungkap dan " +
                        "melawan para petinggi kerajaan yang korupsi. Film ini akan menceritakan awal kisah Robin " +
                        "sebelum ia menjadi pencuri legendaris Inggris.",
                R.drawable.poster_robinhood
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(6,
                "SPYDERMAN",
                "4.4 from 5",
                "5/5/2019",
                "Spider-Man: Far From Home bercerita tentang kehidupan Peter Parker (Tom Holland) setelah Avengers: " +
                        "Endgame. Ia menjalani hidup dalam kesedihan karena kehilangan sang mentor, Tony Stark alias Iron Man." +
                        "Peter tidak bisa menjadi pahlawan super sepenuhnya lantaran masih menimba ilmu di tingkat Sekolah " +
                        "Menengah Atas (SMA). Ia menyadari hal itu, sampai akhirnya ia sempat tak ingin menjadi Spider-Man " +
                        "saat sedang berlibur ke Eropa selama dua minggu bersama teman-teman sekolahnya." +
                        "Liburan Peter tak berjalan sesuai rencana karena ia kedatangan Nick Fury (Samuel L Jackson). " +
                        "Nick memperkenalkan Peter dengan Quentin Beck alias Mysterio (Jake Gyllenhaal) untuk bekerja " +
                        "sama menghadapi Hydro-Man.",
                R.drawable.poster_spiderman
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(7,
                "THE GIRL",
                "4.4 from 5",
                "5/5/2019",
                "Lisbeth dan Mikael kali ini bertemu lagi dalam suatu misteri. Sebuah jaringan mata-mata yang mengingati " +
                        "para pejabat korup. Keduanya menemukan beberapa bukti-bukti kuat yang bisa memenjarakan pejabat " +
                        "korup tersebut. Buat kamu yang belum tahu latar belakang Lisbeth, ia adalah seorang jurnalis " +
                        "investigasi dan juga seorang peretas dengan jaringan internasional yang luar biasa." +
                        "Lisbeth sering berurusan dengan kasus-kasus kriminal yang membutuhkan kecerdasan pikiran " +
                        "dan kemampuan analissi yang kuat. Dihubungkan dengan kecanggihan teknologi, Lisbeth berusaha " +
                        "mencari tahu hal-hal yang berkaitan dengan urusannya.",
                R.drawable.poster_thegirl
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(8,
                "THE MULE",
                "4.4 from 5",
                "5/5/2019",
                "Earl Stone (Clint Eastwood) adalah seorang veteran Perang Dunia II berusia 90 tahun pemilik Sunnyside " +
                        "Flowe Farm. Memiliki tuntutan hidup yang berat ditambah hubungannya yang retak dengan anak " +
                        "perempuannya, Iris (Alison Eastwood), ia berubah menjadi seorang bandar sekaligus kurir narkoba t" +
                        "ertua di tempatnya." +
                        "Earl Stone kemudian tertangkap membawa truk yang berisi kokain seharga lebih dari 3 juta Dollar. " +
                        "Ia akan mengantarkan kokain itu ke salah satu gembong narkoba terbesar yang ada di Meksiko yaitu Sinaola Cartel. " +
                        "Collin Bates (Bradley Cooper) ditugaskan untuk menyelidiki Sianola Cartel yang semakin lama semakin besar. Di sisi lain, " +
                        "Earl Stone harus menjaga Iris dan juga cucunya Grinny (Taissa Farmiga) dari ancaman bahaya.",
                R.drawable.poster_themule
            )
        )

        tvShowEntitiy.add(
            TvShowEntity(9,
                "VENOM",
                "4.4 from 5",
                "5/5/2019",
                "Buat para penggemar komik Marvel atau film superhero, pastinya sudah tak asing dengan sosok Venom. " +
                        "Dia pun pernah muncul di film SPIDER-MAN 3 sebagai musuh dari Peter Parker. Kini sosok Venom " +
                        "yang aslinya seorang anti-hero ini dapat film sendiri lho dan dibintangi oleh Tom Hardy bersama " +
                        "dengan Michelle Williams, Riz Ahmed dan lainnya.\n" +
                        "Sekedar informasi saja, VENOM diproduksi oleh Columbia Pictures dengan tentu saja masih bekerja " +
                        "sama dengan pihak Marvel. Filmnya akan didistribusikan oleh Sony Pictures Releasing dan rencananya " +
                        "akan menjadi bagian pertama dari Sony's Marvel Universe.",
                R.drawable.poster_venom
            )
        )
        return tvShowEntitiy
    }
    fun movieDetail(id:Int):MovieEntity = generateMovieData()[id]

    fun tvShowDetail(id:Int):TvShowEntity  = generateTvShowData()[id]
}

