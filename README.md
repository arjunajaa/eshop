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
