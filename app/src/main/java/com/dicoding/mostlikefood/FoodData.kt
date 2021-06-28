package com.dicoding.mostlikefood

import java.time.chrono.HijrahEra

object FoodData {
    private val foodNames = arrayOf(
        "Gado-Gado",
        "Sop Buntut",
        "Tempe",
        "Rendang",
        "Nasi goreng",
        "Mie goreng",
        "Bakso",
        "Sate",
        "Gudeg",
        "Soto"
    )

    private val foodDetails = arrayOf(
        "Makanan khas Jawa yang bisa disebut sebagai \"saladnya\" Indonesia ini cukup terkenal di luar negeri, terutama di Napoli, Italia. Hal ini dikarenakan gado-gado pernah diikutsertakan dalam kompetisi yang bersaing dengan hidangan dari negara-negara lainnya dan meraih juara pertama. Terhitung dari nilai estetika yang dimiliki, keunikan bahan yang digunakan, serta cita rasa yang dinilai sangat tinggi.",
        "Sop buntut sapi, selain digemari masyarakat Indonesia, ternyata juga disukai penduduk Spanyol. Mereka menyukai makanan ini sejak pertama kali kedutaan Indonesia di Italia mengenalkan keanekaragaman makanan khas kita. Kesukaan rakyat Spanyol akan hidangan sapi pun terpuaskan dengan adanya sop buntut ini.",
        "Tempe yang terbuat dari kacang kedelai bisa digabungkan dengan cara penyajian yang bervariatif. Namun tahukah kamu, masyarakat Jepang membuat hidangan ini sebagai salah satu favorit mereka lho. Berawal dari seseorang yang menjual tempe dalam sebuah bazaar kuliner Jepang. Sekali mencoba, mereka langsung menyukainya.",
        "Selain disukai masyarakat Indonesia, makanan khas Sumatera Barat ini juga tersohor hingga seluruh penjuru dunia. Rendang berada di posisi pertama dalam jajaran 50 makanan dunia terenak versi CNN yang diadakan di Jerman beberapa waktu lalu. Rasanya yang khas dan keempukan dagingnya menjadi faktor penentu utama.",
        "Setiap negara memiliki menu nasi goreng. Namun, rasa nasi goreng Indonesia lebih khas karena memakai bumbu lengkap. Gak heran kalau nasi goreng Indonesia juga sempat masuk dalam daftar makanan terenak di dunia. Presiden Amerika Serikat ke-44 Barrack Obama pun sangat menyukai nasi goreng khas Indonesia.",
        "Pasangan nasi goreng ini bisa kamu temukan di mana-mana. Variasi bumbu dan bahan membuat lezatnya mie goreng khas Indonesia tak tertandingi.",
        "Kuah sup dan mie memang menjadi bagian dari pelengkap bakso. Kita bisa menemukan bakso di mana pun. Ternyata bakso jadi salah satu makanan favorit warga Tiongkok lho. Pasalnya, bakso yang ada di Indonesia dibuat dari daging sapi yang lebih menggugah selera, ditambah dengan gorengan atau pangsit untuk melengkapinya.",
        "Sate Padang dan sate Madura menjadi varian yang paling dikenal sekaligus favorit banyak orang. Belakangan, tidak hanya wisatawan asing yang mencari dan ingin mencoba sate, tetapi sejumlah restoran internasional telah memasukkan sate dalam menunya. Di New York, terdapat sebuah restoran bernama Satay Junction yang menyediakan sate ayam sebagai hidangan andalannya.",
        "Makanan khas Yogyakarta ini telah menarik perhatian masyarakat Indonesia, bahkan di kalangan internasional. Pasalnya, banyak negara yang ingin mengimpornya dalam bentuk kalengan. Menariknya lagi, di Melbourne, Australia, terdapat satu restoran yang telah menyajikan gudeg asli dari Indonesia, tepatnya di Clayton Road.",
        "Indonesia memiliki banyak varian soto yang tersebar di berbagai wilayah, antara lain soto Betawi, coto Makassar, soto ayam, soto sapi, dan soto babat. Keunikan setiap rempah dan ciri khas masing-masing inilah yang membuat soto menjadi salah satu makanan ternama di dunia. Masyarakat Ibaraki, Jepang, pun telah terbiasa dengan cita rasa yang telah diperkenalkan beberapa pelajar Indonesia yang ada di sana."

    )

    private val foodRecipe = arrayListOf(
                "- 1/4 kol iris tipis, rebus\n" +
                "- 10 helai kacang panjang potong-potong, rebus\n" +
                "- 1 genggam toge, rebus\n" +
                "- 1 buah timun potong-potong\n" +
                "- 1 buah tahu kotak goreng\n" +
                "- Tomat\n" +
                "- Kentang rebus\n" +
                "- Telur rebus\n" +
                "- Daun selada\n" +
                "- Lontong\n" +
                "- Emping melinjo\n" +
                "- Bawang goreng untuk taburan",

                "- 800 gram buntut sapi\n" +
                "- 3 buah tomat merah ranum, potong\n" +
                "- 2 buah kentang, potong\n" +
                "- 2 buah wortel, potong\n" +
                "- 2 ikat seledri (jangan buang batangnya)\n" +
                "- 1 sdm irisan daun seledri\n" +
                "- 1 sdm bawang merah goreng\n" +
                "- 1 sdt bawang putih goreng\n" +
                "- 1/2 buah pala\n" +
                "- 2 buah cengkeh\n" +
                "- 2 buah bunga lawang\n" +
                "- 3 butir kapulaga\n" +
                "- 8 butir bawang merah, haluskan\n" +
                "- 5 siung bawang putih, haluskan\n" +
                "- secukupnya Gula garam dan merica\n" +
                "- 2 sdm margarin",

                "- 5 Lempeng Tempe sedang (Potong kotak)\n" +
                        "- 3 Siung Bawang Putih (Iris Tipis)\n" +
                        "- 2-3 Sdm Kecap Manis atau sesuai selera. (Saya Pakai merk Bango)\n" +
                        "- 2 cm Lengkuas (memarkan)\n" +
                        "- 2 Lembar Daun Salam\n" +
                        "- 7 Buah Cabai Merah (Iris serong)\n" +
                        "- 5 Buah Cabai Hijau (iris serong)\n" +
                        "- 2 Sdm Saos Sambal\n" +
                        "- 1 Sdm Kaldu Ayam Bubuk\n" +
                        "- 1/2 Sdt Gula Pasir\n" +
                        "- Secukupnya Garam\n" +
                        "- 1 Gelas Air\n" +
                        "- 3 Sdm Minyak untuk menumis\n" +
                        "- Bumbu Halus :\n" +
                        "- 2 Siung Bawang Putih\n" +
                        "- 2 Buah Bawang Merah\n" +
                        "- 1/4 Sdt Merica\n" +
                        "- Secukupnya Garam",

                "- 1/2 kg daging (lebih sedikit)\n" +
                    "- 2 butir kelapa (pisahkan santan kental & santan encer)\n" +
                    "- Bumbu halus\n" +
                    "- 7 siung bawang merah (haluskan)\n" +
                    "- 5 siung bawang putih (haluskan)\n" +
                    "- 3 cm jahe (haluskan)\n" +
                    "- 2 cm kunyit (haluskan)\n" +
                    "- 3 lembar daun jeruk\n" +
                    "- Sedikit lengkuas (haluskan)\n" +
                    "- 1 lembar daun kunyit (buang bagian tulang daun nya)\n" +
                    "- 1 buah serai (digeprek)\n" +
                    "- 15 biji cabe rawit (kalo gak suka pedas boleh skip)\n" +
                    "- 4 sdm Cabe giling halus (secukupnya)\n" +
                    "- Secukupnya Garam\n" +
                    "- 1/2 sdt Pala bubuk",

            "- 1 piring nasi dingin\n" +
                    "- 5 bh cabe rawit, iris\n" +
                    "- 3 bh bawang merah, iris\n" +
                    "- 2 siung bawang putih, iris\n" +
                    "- 1 btr telur\n" +
                    "- 1 sdm kecap manis\n" +
                    "- 1 sdm kecap asin\n" +
                    "- 1/2 sdt gula pasir\n" +
                    "- 1/2 sdt merica\n" +
                    "- secukupnya Garam",

            "- 1 bungkus mie burung dara\n" +
                    "- 1 genggam sawi hijau (iris-iris)\n" +
                    "- 1 butir telur (opsional)\n" +
                    "- 1 buah sosis ayam\n" +
                    "- 2 buah bakso sosis\n" +
                    "- Secukupnya gula garam\n" +
                    "- Secukupnya kecap manis (sesuai selera)\n" +
                    "- 2 sdt soy sauce (saya pakai kikoman)\n" +
                    "- Secukupnya minyak goreng\n" +
                    "- Bumbu halus:\n" +
                    "- 5 buah bawang merah\n" +
                    "- 5 buah bawang putih\n" +
                    "- 1-2 buah kemiri\n" +
                    "- 2 buah cabe merah keriting\n" +
                    "- 3 buah cabe rawit merah (opsional)",

            "- 500 gram daging sapi, cuci bersih potong kecil2\n" +
                    "- 12 buah es batu ukuran 2x2 cm sekitar 100 gram\n" +
                    "- 1 buah putih telur\n" +
                    "- 9 sdm Tepung tapioka\n" +
                    "- 2 sdt garam halus\n" +
                    "- 1 sdt merica halus\n" +
                    "- 1 sdt baking powder\n" +
                    "- 1 sdm bawang putih bubuk (bisa pakai 4 buah di goreng dulu ya)\n" +
                    "- 2500 ml air\n" +
                    "- Bahan kuah:\n" +
                    "- 2000 ml air (sisa air rebusan bakso)\n" +
                    "- 12 buah bawang putih, haluskan\n" +
                    "- Secukupnya Gula garam dan merica\n" +
                    "- 1 batang daun bawang, iris kecil2\n" +
                    "- Bahan pelengkap:\n" +
                    "- Secukupnya pakcoy rebus\n" +
                    "- Secukupnya mie putih atau kuning rebus\n" +
                    "- Secukupnya daun bawang, iris2\n" +
                    "- Secukupnya saos dan kecap manis\n" +
                    "- Secukupnya sambal rebus",

            "- 250 gr daging ayam bagian dada\n" +
                    "- 100 gr kacang tanah\n" +
                    "- 200 ml air\n" +
                    "- 3 sdm kecap manis\n" +
                    "- Bumbu halus :\n" +
                    "- 3 siung bawang putih\n" +
                    "- 2 siung bawang merah\n" +
                    "- 3 buah kemiri yg di sangrai\n" +
                    "- 10 buah cabe rawit\n" +
                    "- 1/2 sdt garam\n" +
                    "- 1 sdm gula merah\n" +
                    "- 1 lembar daun jeruk purut\n" +
                    "- Taburan :\n" +
                    "- secukupnya bawang merah mentah Irisan\n" +
                    "- secukupnya cabe rawit Irisan",

            "- 2 kg nangka muda (potong sesuai selera, saya potong kotak 3cm)\n" +
                    "- 2 block gula merah\n" +
                    "- 6 sdm gula pasir/ sesuai selera\n" +
                    "- Secukupnya garam\n" +
                    "- 4 lembar daun jati\n" +
                    "- Daun salam (sekitar 20lmbr)\n" +
                    "- Lengkuas potong tipis\n" +
                    "- 2 lt santan\n" +
                    "- Bumbu halus\n" +
                    "- 10 bawang putih\n" +
                    "- 15 bawang merah\n" +
                    "- 10 kemiri\n" +
                    "- 1 sdt ketumbar\n" +
                    "- 1/2 sdt merica\n" +
                    "- Minyak untuk menumis",

            "- - 500 gram ayam\n" +
                    "- 250 gram ceker\n" +
                    "- 3 lembar daun salam\n" +
                    "- 3 lembar daun jeruk\n" +
                    "- 2 batang serai (geprek)\n" +
                    "- 1 buah tomat (potong sedang)\n" +
                    "- 2 ons daun bawang + seledri (potong 1/2 cm)\n" +
                    "- 6 cm lengkuas (geprek)\n" +
                    "- 2 liter air\n" +
                    "- 5 sdm minyak (untuk menumis bumbu)\n" +
                    "- secukupnya Garam\n" +
                    "- secukupnya Gula\n" +
                    "- secukupnya Penyedap rasa\n" +
                    "- Bumbu Halus :\n" +
                    "- 6 siung bawang merah\n" +
                    "- 4 siung bawang putih\n" +
                    "- 4 buah kemiri\n" +
                    "- 1/4 sdt merica bubuk\n" +
                    "- 5 cm kunyit\n" +
                    "- 4 cm jahe\n" +
                    "- Pelengkap :\n" +
                    "- secukupnya bawang goreng\n" +
                    "- secukupnya Taoge\n" +
                    "- 1 batang Seledri potong2 kecil\n" +
                    "- 1 buah jeruk nipis potong jadi 6\n" +
                    "- sesuai selera Sambal kecap\n" +
                    "- 1 bgks Soun (aku g pake)\n" +
                    "- 1/4 buah Koll (aku g pake)\n" +
                    "- sesuai selera Krupuk udang"

    )

    private val foodStep = arrayListOf(
            "- Buat bumbu kacang : goreng kacang setengah matang, lalu masukkan bawang dan cabe. Goreng bersamaan hingga matang. Kmudian blender dengan sedikit air sampai halus. Rebus 200 ml air dgn gula yg telah disisir. Tunggu hingga mendidih, masukkan kacang giling. Aduk hingga rata, masukkan santan, daun jeruk, dan air asam. Tambahkan garam, tes rasa. Jika dirasa kuah kurang kental, bisa ditambahkan maizena yg telah dilarutkan dg air. Tunggu hingga kuah meletup. Matikan.\n" +
                    "- Gado-gado Siram Surabaya langkah memasak 1 foto\n" +
                    "- Goreng tahu dan tempe yg telah dibumbui garam dan ketumbar, potong2.\n" +
                    "- Rebus wortel dan kacang panjang yg telah diiris sesuai selera\n" +
                    "- Tata sayuran, lontong, tahu tempe, dan telur dalam piring. Siram kuah kacang, tabur bawang merah goreng dan kerupuk diatasnya. Bisa ditambahkan sambal dan kecap bagi yg suka. Gado2 siram siap dinikmati.",

            "- Bersihkan buntut sapi. Rebus hingga mendidih dalam panci biasa selama 15 menit. Buang airnya, cuci bersih buntut\n" +
                    "- Tuang 500 ml air atau secukupnya ke dalam slow cooker, asal semua bagian buntut terendam air. Tambahkan 1 sdt garam. Set slow, masak selama 2 jam\n" +
                    "- Panaskan margarin. Tumis bawang putih dan merah hingga harum\n" +
                    "- Siapkan panci, tuang hasil rebusan buntut pada slowcooker tadi beserta airnya, masukan garam gula merica, bumbu yang sudah ditumis, 2 buah tomat yang dipotong-potong, bunga lawang, cengkeh, kapulaga, pala, bawang goreng dan ikat seledri. Rebus dengan api kecil selama 2 jam\n" +
                    "- Masukan kentang dan wortel. Tunggu hingga lunak. Koreksi rasa, masukan irisan daun seledri dan 1 buah tomat potong. Sajikan",

            "- Siapkan semua bahan orek. Iris bawang putih, potong tempe, memarkan lengkuas dan iris cabai.\n" +
                    "- Haluskan semua bumbu halus.\n" +
                    "- Orek Tempe Pedas Manis langkah memasak 2 foto\n" +
                    "- Goreng tempe setengah matang.\n" +
                    "- Panaskan minyak, tumis bawang putih hingga harum. Masukkan lengkuas dan daun salam, tumis sebentar.\n" +
                    "- Masukkan tempe, kaldu ayam bubuk, gula, garam dan air. Aduk rata.\n" +
                    "- Terakhir Masukan kecap manis dan saos sambal, aduk kembali, biarkan meresap dan mengering (uji rasa) Angkat\n" +
                    "- Orek Tempe Pedas Manis siap disajikan. Selamat mencoba" +
                    "- Catatan : Masukan Kecap dan saos sambal saat posisi air sedikit mengering, baru lanjut dikeringkan benar-benar kering.",

            "- Cuci bersih daging\n" +
                    "- Siapkan bumbu2 yang akan dihaluskan\n" +
                    "- Giling halus kunyit, jahe, bawang putih, bawang merah, & lengkuas dengan 1/2 sdt garam. Kemudian giling kasar cabe rawit. Saya menyarankan bumbu halus nya itu digiling manual aja (gak usah pake blender).\n" +
                    "- Semua bumbu yg sudah digiling dicampurkan ke daging. Masukkan cabe giling. Aduk rata sampai bumbu meresap ke daging\n" +
                    "- Siapkan santan kental, masukkan daun kunyit, daun jeruk, serai\n" +
                    "- Panaskan santan sebelum daging dimasukkan. Aduk terus jangan sampai pecah santan. Kalau sudah mendidih, masukkan daging\n" +
                    "- Masukkan sedikit pala bubuk\n" +
                    "- Aduk terus daging & apabila dirasa santan nya masih kurang pedas, bisa ditambahkan cabe giling lg. Sehingga warna kuahnya bisa spt gbr disamping.\n" +
                    "- Pindahkan rendang menggunakan kuali besi spy minyak dari rendang bisa keluar. Aduk terus rendang sampai kental spt gbr disamping. Apabila daging masih dirasa keras, campurkan santan encer. Pada gbr disamping ini daging sudah bisa dimakan (ini yg disebut kalio).\n" +
                    "- Rendang sudah selesai. Supaya rendang bisa coklat spt ini harus selalu diaduk dgn api kecil sampai rendang menjadi kering dan berubah warna.\n" +
                    "- Rendang lebih nikmat jika dimasukkan kentang atau kacang merah.",
            "- Kocok telur beri sedikit garam. Panaskan minyak di wajan. Masukkan telur, bikin orak arik. Sisihkan\n" +
                    "- Dg sisa minyak di wajan, tumis bawang merah, bawang putih dan cabe hingga harum. Masukkan nasi dan telur orak arik. Beri kecap2an, garam, gula dan merica. Aduk rata\n" +
                    "- Masak sambil terus diaduk hingga nasi agak kering. Koreksi rasa. Angkat. Sajikan nasgor dg telur ceplok dan irisan timun\n" +
                    "- Tips : jumlah kecap bisa ditambah sesuai selera",

            "- Haluskan bumbu, potong-potong sawi, sosis dan bakso sosis.\n" +
                    "- Tumis bumbu halus sampai harum.\n" +
                    "- Masukkan potongan sosis dan bakso sosis, aduk-aduk. Sisihkan dibagian wajan yang lain. Kemudian masukkan telur, orak-arik sampai matang, kemudian aduk semua.\n" +
                    "- Tambahkan gula, garam, kecap manis dan soy sauce. Masukkan mie yang sudah direbus sebelumnya. Aduk-aduk. Masukkan sawi. Aduk-aduk lagi. Cicipi rasanya, kalau kecap kurang bisa ditambahkin. Kalau terlalu kering juga boleh tambah air dikit.\n" +
                    "- Kalau rasa udah cocok, udah deh. matikan api.",

            "- Siapkan semua bahan\n" +
                    "- Hancurkan es batu dengan cara masukkan kedalam plastik lalu pukul2 sampai halus. (Ini jika tidak ada alat serut es ya, jika ada tentu saja lebih halus pakai alat serut.)\n" +
                    "- Potong daging kecil2, lalu masukkan kedalam food processor proses sampai halus, masukkan es batu sedikit demi sedikit. Masukkan putih telur proses sampai halus\n" +
                    "- Masukkan tepung tapioka, baking powder, bawang putih bubuk merica dan garam proses lagi sampai tercampur rata dan tekstur adonan seperti pasta\n" +
                    "- Adonan seperti ini\n" +
                    "- Didihkan air sampai mendidih, matikan api kompor. Bentuk bulat2 dengan tangan(lihat di gambar) lalu dengan bantuan sendok makan masukkan adonan ke dalam air yang sudah mendidih tadi.(agar bakso tidak lengket di sendok, celup sendok di air ya). Lakukan sampai adonan habis, Nyalakan api kompor dengan api sedang tunggu bakso mengapung. Angkat\n" +
                    "- Lalu masukkan di air es. Angkat tiriskan\n" +
                    "- Buat kuah nya. Tumis bawang putih yang sudah dihaluskan tadi sampai harum, lalu masukkan ke dalam air sisa rebusan bakso (lebih enak kuahnya dicampur dengan rebusan tulang2 ya) masukkan garam dan merica. biarkan mendidih, masukkan daun bawang. Angkat dan siap dijadikan kuah bakso\n" +
                    "- Penyajian. Siapkan mangkok, beri mie putih dan mie kuning secukupnya, tata bakso dan juga pakcoy siram dengan kuah beri taburan daun bawang. Beri saos sambal, sambal rebus dan kecap manis",

            "- Bersihkan dan potong dadu daging ayam... Lalu lumuri dengan garam sebanyak 1 sdt dan perasan jeruk nipis... Diam kan sebentar biar meresap.\n" +
                    "- Sangrai kacang tanah sampai matang\n" +
                    "- Uleg/blender kacang sampai halus dan berikan gula merah sebanyak 1 sdm.\n" +
                    "- Uleg bumbu halus, sama daun jeruknya,\n" +
                    "- Panaskan minyak secukupnya, tumis bumbu halus,\n" +
                    "- Setelah itu masukan air. Masak sampai mendidih\n" +
                    "- Setelah mendidih masukkan kacang yang telah d uleg td\n" +
                    "- Masukan 3 sdm kecap, lalu masak sampai kental dg api kecil. Koreksi rasa... Lalu angkat.\n" +
                    "- Ambil 3 sdm saus kacang tadi masukan kedalam mangkok. Tambahkan 1 sdm kecap dan 1 sdm air. Aduk sampai rata\n" +
                    "- Tusuk daging ke lidi khusus utk sate\n" +
                    "- Setelah itu celupkan bumbu kacang yang 3sdm td ke daging yg telah d tusuk. Diamkan didalam kulkas agar bumbu meresap kurang lebih 1 jam.\n" +
                    "- Panggang sate sampai mateng.\n" +
                    "- Sate siap untuk dinikmati",

            "- Sangrai kemiri dan ketumbar sebelum dihaluskan, lalu haluskan seluruh bumbu halus\n" +
                    "- Tumis bumbu halus hingga matang, jangan gosong yaa \n" +
                    "- Setelah dicuci tata nangka muda dalam panci, urutannya tata 2 daun jati, salam lalu lengkuas, masukka setengah bagian nangka muda, ulangi lg urutan diatas, setelah nangka masuk semua letakkan tumisan bumbu halus dan gula diatasnya, baru masukkan santan ke panci,\n" +
                    "- Kemudian rebus hingga +/- 5jam, aduk sesekali aja seperlunya\n" +
                    "- Jangan lupa dicek, klo kuah hampir habis bisa ditambah santan atau air, hasil akhir kuahnya memang menyusut",

            "- Rebus 1 liter air masukkan ayam dan ceker kurang lebih 10mnt, sisihkan air nya untuk kuah soto\n" +
                    "- Haluskan bumbu tambahkan serai geprek daun jeruk dan lengkuas geprek\n" +
                    "- Panaskan minyak, tumis bumbu sampai harum, matikan api\n" +
                    "- Iris2 tomat dan juga daun bawang sledri sisihkan\n" +
                    "- Siapkan panci, panaskan 1 liter air dan tambahkan air rebusan ayam tadi masukkan ceker, tuang bumbu yang sudah di tumis ke dalam panci, tambahkan daun salam, gula, garam dan penyedap rasa, tunggu hingga mendidih, masukkan daun bawang dan tomat, koreksi rasa, setelah pas, matikan api, beri bawang goreng\n" +
                    "- Masukkan ayam yang di rebus tadi ke dalam air garam, goreng sampai kecoklatan, suwir(iris2), siapkan taoge jeruk nipis bawang goreng (bawang gorengnya g keliatan masih di toples) sambal kecapnya jangan lupa dan juga krupuk udang, racik sendiri ya sotonya"
    )


    private val foodImages = intArrayOf(
        R.drawable.gadogado,
        R.drawable.sop_buntut,
        R.drawable.tempe,
        R.drawable.rendang,
        R.drawable.nasi_goreng,
        R.drawable.mie_goreng,
        R.drawable.bakso,
        R.drawable.sate,
        R.drawable.gudeg,
        R.drawable.soto
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices){
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.recipe = foodRecipe[position]
                food.photo = foodImages[position]
                food.step = foodStep[position]
                list.add(food)
            }
            return list
        }
}