package com.example.daftarfakultas

object FacultyData {
    private val facultyNames = arrayOf(
        "Fakultas sains dan teknologi",
        "Fakultas teknologi industri",
        "Fakultas kesehatan masyarakat",
        "Fakultas farmasi",
        "Fakultas ekonomi dan bisnis",
        "Fakultas psikologi",
        "Fakultas hukum",
        "Fakultas sastra, budaya, dan komunikasi",
        "Fakultas kedokteran",
        "Fakultas keguruan dan ilmu pendidikan"
    )

    private val facultyLocation = arrayOf(
        "Kampus 4",
        "Kampus 4",
        "Kampus 3",
        "Kampus 3",
        "Kampus 1",
        "Kampus 1",
        "Kampus 4",
        "Kampus 4",
        "Kampus 4",
        "Kampus 2 dan 4"
    )
    private val facultyDetails = arrayOf(
        "menjadi fakultas yang unggul dalam penguasaan dan pengembangan MIPA untuk menopang kemajuan teknologi,  berwawasan internasional, dan dilandasi nilai-nilai Islam.",
        "Menjadi fakultas unggulan yang diakui secara internasional dalam bidang teknologi berbasis nilai-nilai Islam dan menghasilkan lulusan yang berjiwa entrepreneurship.",
        "Unggul dalam Kompetisi, Berwawasan Global, Berlandaskan Nilai Keislaman dan Berorientasi pada Healthy City.",
        "Menjadi lembaga pendidikan tinggi farmasi yang unggul, diakui secara internasional, dan dijiwai nilai-nilai Islam.",
        "Menjadi  fakultas yang unggul dalam bidang ekonomi, bisnis, dan entrepreneurship, berwawasan global, dan berlandaskan  pada nilai-nilai Islam ‘2025",
        "Menjadi pusat pengembangan psikologi yang berbasis pada komunitas yang  dijiwai nilai-nilai Islam dan diakui secara Internasional",
        "Menjadi Fakultas Hukum yang unggul dan diakui secara internasional dalam penguasaan ilmu pengetahuan dan ketrampilan hukum, dijiwai nilai-nilai Islam dan semangat pembaharuan.",
        "Menjadi fakultas yang mampu bersaing secara internasional dalam bidang sastra, budaya, dan komunikasi yang dijiwai nilai-nilai Islam",
        "Menjadi Fakultas Kedokteran yang unggul dalam pendidikan, penelitian dan pengabdian di bidang kesehatan kebencanaan yang dijiwai nilai-nilai Islam yang diakui secara internasional.",
        "Tahun 2030 FKIP menjadi Lembaga Pendidikan Tenaga Kependidikan yang unggul, inovatif, berwawasan global, dan dijiwai nilai-nilai Islam"
    )

    private val facultyPhoto = intArrayOf(
        R.drawable.fast,
        R.drawable.fti,
        R.drawable.fkm,
        R.drawable.farmasi,
        R.drawable.feb,
        R.drawable.fpsi,
        R.drawable.law,
        R.drawable.fsbk,
        R.drawable.fk,
        R.drawable.fkip
    )

    val listData: ArrayList<Faculty>
        get() {
            val list = arrayListOf<Faculty>()
            for (position in facultyNames.indices) {
                val faculty = Faculty()
                    faculty.name= facultyNames[position]
                    faculty.location = facultyLocation[position]
                    faculty.detail = facultyDetails[position]
                    faculty.photo = facultyPhoto[position]
                    list.add(faculty)
            }
            return list
        }
}