import java.util.*

public var input = Scanner(System.`in`);

fun main() {
    println("============IDENTITAS===============");
    print("Nama : ");
    var n: String? = input.nextLine();
    if (n.isNullOrEmpty()){
        println("Nama wajib di isi")
        main()
    }

    print("Kelas : ");
    var k: String = input.nextLine();
    print("Nomor absen : ")
    var na: String = input.nextLine();
    print("Masukan email : ")
    val email:String? = null
    val emailLength = email?.length ?:"Ups Saya lupa memberi program input untuk email"
    println(emailLength)
    println("====================================");
    menu()

}
fun menu(){
    println("================MENU================");
    println("1. Kerucut\n2. Tabung\n3. to exit")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        3 -> exit()
        else -> {
            println("Opps tidak ada")
            menu()
        }
    }
}
fun kerucut(){
    println("============KERUCUT===============");
    print("Masukan tinggi kerucut : ");
    val tinggi:Double = input.nextDouble();
    print("Masukan jari-jari kerucut : ");
    val radius:Double = input.nextDouble();
    val volume:Double = (0.33333) * Math.PI * (radius*radius) * tinggi;
    println ("Volume kerucut adalah $volume") //pembulatan 2 angka belakang
    System.out.printf("%.2f",volume)
    println()
    menu()
    println("=================================");
}

fun tabung(){
    println("============TABUNG===============");
    print("Masukan tinggi tabung : ");
    var tinggi:Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var radius:Double? = null
    radius = input.nextDouble();

    val volume = Math.PI * radius * radius * tinggi
    println("Volume tabung adalah : $volume")
    System.out.printf("%.2f",volume)
    println()
    menu()
}
fun exit(){
    System.exit(0)
}