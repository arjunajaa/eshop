> Arju Naja Muhammad - 2206082045
# Tutorial 1
## Refleksi 1
Pada tutorial pertama ini, saya mempelajari tentang clean code dan secure code. Clean code menjadi penting karena akan memudahkan dalam pengembangan dan pemeliharaan kode. Sedangkan secure code menjadi penting karena akan meminimalisir resiko terjadinya serangan keamanan.
<br>
Beberapa clean code saya terapkan dalam tutorial ini adalah:
1. Menggunakan nama variabel yang jelas dan mudah dipahami
2. Menggunakan fungsi yang singkat dan mudah dipahami

<br>
Namun karena program pada tutorial ini masih sederhana, saya belum menerapkan secure code dengan baik. Saya akan mempelajari lebih lanjut tentang secure code agar dapat menerapkannya dengan baik pada program yang lebih kompleks.
Maka dari itu, saat ini saya mulai mengumpulkan informasi tentang secure code agar dapat menerapkannya dengan baik pada program yang lebih kompleks.
<br>

## Refleksi 2
1. Saya merasa unit test adalah hal yang penting dalam pengembangan perangkat lunak karena dengan unit test, kita dapat memastikan bahwa kode yang kita buat berjalan dengan baik. Selain itu, unit test juga memudahkan dalam melakukan debugging. Jumlah unit test yang baik adalah sebanyak mungkin, namun harus tetap efisien. Dalam artian, setiap fungsi yang kita buat harus memiliki unit test. <br>
Setelah saya membaca lebih lanjut tentang code coverage, saya merasa bahwa code coverage juga penting dalam pengembangan perangkat lunak. Code coverage akan memastikan bahwa setiap baris kode yang kita buat sudah diuji. Dengan code coverage, kita dapat memastikan bahwa kode yang kita buat sudah diuji dengan baik. <br>
Namun walaupun saya memiliki 100% code coverage, saya tidak bisa memastikan bahwa kode yang saya buat sudah benar-benar bebas dari bug. Oleh karena itu, saya harus tetap melakukan unit test dengan baik. <br>
2. Membuat kelas Java baru yang memiliki kesamaan dengan suite pengujian fungsional sebelumnya, termasuk prosedur pengaturan dan variabel instan yang sama, dapat menimbulkan beberapa tantangan terkait dengan prinsip clean code. Salah satu masalah yang mungkin timbul adalah duplikasi kode, yang dapat membuat kode sulit untuk dikelola dan dipelihara. Jika terjadi perubahan pada prosedur pengaturan atau variabel instan, diperlukan upaya tambahan untuk memperbarui semua kelas pengujian fungsional yang terkait. Hal ini tidak hanya meningkatkan risiko kesalahan, tetapi juga memakan waktu lebih lama dalam proses pemeliharaan kode. Oleh karena itu, penting untuk mempertimbangkan strategi alternatif yang dapat mengurangi duplikasi kode dan meningkatkan keterbacaan dan efisiensi kode secara keseluruhan.

# Tutorial 2

## Refleksi

1. Saya menemukan 2 isu, yaitu isu modifier dan isu import yang tidak terpakai. Untuk mengatasi isu modifier, saya menghapus modifier public. Sedangkan untuk mengatasi isu import yang tidak terpakai, saya menghapus import yang tidak terpakai. <br>
2. Implementasi CI/CD pada proyek kode saya telah berhasil dilakukan dengan menggunakan beberapa alat dan platform terkemuka. Untuk Continuous Integration (CI), saya mengandalkan Github Actions sebagai solusi yang memungkinkan otomatisasi workflows secara efisien. Saya telah menyiapkan beberapa workflows, termasuk ci.yml, build.yml, dan scorecard.yml, yang dijalankan setiap kali ada tindakan push, pull, atau merge pada setiap branch dalam repositori saya. <br>
   Di sisi Continuous Deployment (CD), saya memakai Koyeb sebagai platform utama untuk menyediakan layanan deployment yang lancar dan terkelola. Dengan integrasi yang tepat, Koyeb secara otomatis mendeteksi perubahan pada branch master dan melakukan proses re-deploy aplikasi saya. Ini memastikan bahwa setiap kali ada pembaruan pada kode dalam branch master, perubahan tersebut segera diterapkan ke lingkungan produksi saya tanpa intervensi manual.

# Tutorial 3

Dalam proyek ini, prinsip-prinsip SOLID diterapkan secara konsisten untuk meningkatkan struktur dan kualitas kode. Pertama, prinsip Single Responsibility Principle (SRP) diwujudkan dengan memisahkan tanggung jawab antara CarController dan ProductController ke dalam dua file terpisah. Hal ini memastikan bahwa setiap kelas hanya bertanggung jawab atas satu aspek tertentu, menghindari kebingungan dan mempermudah pemeliharaan kode di masa depan.

Selanjutnya, prinsip Open-Closed Principle (OCP) diterapkan dengan mengubah struktur repositori menjadi menggunakan interface RepositoryInterface. Dengan demikian, repositori dapat diperluas tanpa mengubah kode yang ada, mengikuti prinsip bahwa kelas harus terbuka untuk perluasan tetapi tertutup untuk modifikasi. Selain itu, prinsip Dependency Inversion Principle (DIP) ditegakkan dengan menggunakan abstraksi seperti CarService dan ProductService yang bergantung pada interface daripada implementasi konkret. Hal ini meningkatkan fleksibilitas dan memfasilitasi pengujian karena ketergantungan antar kelas menjadi lebih longgar.

<br> <br>

Penerapan prinsip-prinsip SOLID dalam pengembangan perangkat lunak membawa sejumlah keuntungan signifikan, sementara ketidakpatuhan terhadap prinsip-prinsip ini dapat mengakibatkan sejumlah masalah. Berikut adalah beberapa kelebihan dari penggunaan SOLID dan kekurangan jika tidak mengikuti prinsip-prinsip tersebut:

Kelebihan menggunakan SOLID:
Meningkatkan Keterbacaan dan Pemeliharaan Kode: Dengan memisahkan tanggung jawab, setiap kelas menjadi lebih fokus dan lebih mudah dimengerti. Ini mempermudah dalam memelihara dan mengembangkan kode di masa depan.

Meningkatkan Fleksibilitas: Dengan menggunakan abstraksi dan bergantung pada kontrak/interface daripada implementasi konkret, kode menjadi lebih fleksibel terhadap perubahan. Ini memungkinkan penambahan fitur baru atau modifikasi yang lebih mudah tanpa merusak bagian-bagian yang sudah berjalan.

Meningkatkan Pengujian: Struktur kode yang terorganisir dengan baik, terutama yang mematuhi Dependency Inversion Principle (DIP), memudahkan pengujian unit dan integrasi. Ketergantungan antar komponen menjadi lebih longgar, memungkinkan untuk mengganti atau menyisipkan dependensi palsu selama pengujian.

Kekurangan jika tidak menggunakan SOLID:
Kode yang Sulit Dimengerti dan Dipelihara: Ketidakpatuhan terhadap SOLID sering menghasilkan kode yang kompleks dan sulit dimengerti. Tanggung jawab yang bercampur, kelas yang berukuran besar, dan ketergantungan yang kuat antar komponen membuat kode sulit untuk dipelihara dan dikembangkan.

Ketergantungan Tinggi antar Komponen: Tanpa prinsip-prinsip SOLID, sering kali terjadi ketergantungan yang tinggi antara kelas-kelas dalam sebuah sistem. Hal ini membuat perubahan pada satu bagian dapat mempengaruhi banyak bagian lainnya, meningkatkan risiko kesalahan dan mempersulit pengujian.

Kerentanan terhadap Kesalahan dan Perubahan yang Merusak: Ketergantungan yang tinggi dan kurangnya pemisahan tanggung jawab membuat kode menjadi rentan terhadap kesalahan. Modifikasi atau penambahan fitur baru bisa jadi sulit dilakukan tanpa mempengaruhi bagian-bagian yang sudah berjalan dengan baik, meningkatkan risiko bug dan perubahan yang merusak.

# Tutorial 4

1. Percival (2017) mengusulkan tiga kriteria utama untuk mengevaluasi kualitas seperangkat tes perangkat lunak:

- Correctness:

Functional test sudah memadai untuk memastikan aplikasi berfungsi dengan baik dari perspektif pengguna.
Edge cases sudah diimplementasikan dengan baik, meskipun masih bisa ditingkatkan seperti menangani null di OrderRepository.
Integrated tests bisa memberikan kepastian lebih untuk memastikan semua komponen terintegrasi dengan tepat.

- Clean & Maintainable Code:

Tests yang berhasil memberikan kepastian kapan untuk melakukan refactoring kode.
Tests membantu mengarahkan desain kode yang baik. Unit tests penting untuk umpan balik desain komponen individu.

- Productive Workflow:

Feedback cycle sudah cepat dengan JUnit untuk mendeteksi error.
Integrasi tests bisa dipercepat dengan membatasi cakupannya pada interaksi dengan perubahan kode saja.
Subset test suite bisa dijalankan saat diperlukan.
Tidak terlalu banyak waktu terbuang menunggu tes karena bisa dikerjakan hal lain sambil menunggu.
<br><br>

2. Tes yang dibuat mengikuti prinsip F.I.R.S.T:

Cepat (Fast) - Unit tes berjalan dengan cepat untuk umpan balik instan.

Independen (Independent) - Setiap tes dapat dijalankan sendiri tanpa bergantung pada yang lain.

Dapat Diulangi (Repeatable) - Setiap tes menghasilkan output yang konsisten.

Validasi Otomatis (Self-Validating) - Setiap tes memiliki keluaran pasti lulus/gagal.

Tepat Waktu (Timely) - Tes ditulis sesaat sebelum kode produksi yang meluluskannya.

Menurut saya, saya sudah cukup memenuhi prinsip F.I.R.S.T. Namun, saya akan terus belajar untuk memperbaiki tes yang saya buat agar lebih memenuhi prinsip F.I.R.S.T.