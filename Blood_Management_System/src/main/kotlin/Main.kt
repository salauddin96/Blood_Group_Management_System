import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var login = Login()
    var p1 = p1()
    var p2 = p2()
    var p3 = p3()
    var p4 = p4()
    var p5 = p5()
    var p6 = p6()
    var p7 = p7()
    var p8 = p8()
    var p9 = p9()
    var p10 = p10()
    var p11 = p11()
    var p12 = p12()
    var p13 = p13()
    var p14 = p14()
    var p15 = p15()
    var p16 = p16()
    var p17 = p17()
    var p18 = p18()
    var p19 = p19()
    var p20 = p20()
    var p21 = p21()
    var p22 = p22()
    var p23 = p23()
    var p24 = p24()
    var p25 = p25()
    var p26 = p26()
    var p27 = p27()
    var p28 = p28()
    var p29 = p29()
    var p30 = p30()
    var p31 = p31()
    var p32 = p32()
    var p33 = p33()
    var p34 = p34()
    var p35 = p35()
    var p36 = p36()
    var p37 = p37()
    var p38 = p38()
    var p39 = p39()
    var p40 = p40()
    var p41 = p41()
    var p42 = p42()
    var p43 = p43()
    var p44 = p44()
    var p45 = p45()
    var p46 = p46()
    var p47 = p47()
    var p48 = p48()
    var p49 = p49()
    var p50 = p50()

    println()
    println(" ****************************BLOOD GROUP MANAGEMENT SYSTEM*****************************  ")

    println("User Id: ")
    var read = Scanner(System.`in`)
    while (true) {
        var id: String = read.nextLine()
        if (id == "exit" || id == "0") break

        if (id == login.userId) {
            println("Input Password: ")
            while (true) {
                var pass: Int = read.nextInt()
                if (id == "exit" || id == "0") break
                if (pass == login.password) {
                    println("*********************Welcome to Dashboard*********************")
                    println()
                    println("#You can search by Blood Donor's Name or Blood Group or Address#")
                    println("Enter Name or Blood Group or Address: ")
                    var read = Scanner(System.`in`)
                    while (true) {
                        var check: String = read.nextLine()
                        var count = 0
                        if (id == "exit" || id == "0") break
                        if (check == p1.Name || check == p1.BG || check == p1.Address) {      // Bm Salauddin
                            count++
                            println()
                            println("Id: ${p1.Id}")
                            println("Name: ${p1.Name}")
                            println("Blood Group: ${p1.BG}")
                            println("Address: ${p1.Address}")
                            println("Last Donate Date: ${p1.LDD}")
                            println()


                        }
                        if (check == p2.Name || check == p2.BG || check == p2.Address) {
                            count++
                            println("Id: ${p2.Id}")
                            println("Name: ${p2.Name}")
                            println("Blood Group: ${p2.BG}")
                            println("Address: ${p2.Address}")
                            println("Last Donate Date: ${p2.LDD}")
                            println()
                        }
                        if (check == p3.Name || check == p3.BG || check == p3.Address) {
                            count++
                            println("Id: ${p3.Id}")
                            println("Name: ${p3.Name}")
                            println("Blood Group: ${p3.BG}")
                            println("Address: ${p3.Address}")
                            println("Last Donate Date: ${p3.LDD}")
                            println()
                        }
                        if (check == p4.Name || check == p4.BG || check == p4.Address) {
                            count++
                            println("Id: ${p4.Id}")
                            println("Name: ${p4.Name}")
                            println("Blood Group: ${p4.BG}")
                            println("Address: ${p4.Address}")
                            println("Last Donate Date: ${p4.LDD}")
                            println()
                        }
                        if (check == p5.Name || check == p5.BG || check == p5.Address) {
                            count++
                            println("Id: ${p5.Id}")
                            println("Name: ${p5.Name}")
                            println("Blood Group: ${p5.BG}")
                            println("Address: ${p5.Address}")
                            println("Last Donate Date: ${p5.LDD}")
                            println()
                        }

                        if (check == p6.Name || check == p6.BG || check == p6.Address) {
                            count++
                            println("Id: ${p6.Id}")
                            println("Name: ${p6.Name}")
                            println("Blood Group: ${p6.BG}")
                            println("Address: ${p6.Address}")
                            println("Last Donate Date: ${p6.LDD}")
                            println()
                        }

                        if (check == p7.Name || check == p7.BG || check == p7.Address) {
                            count++
                            println("Id: ${p7.Id}")
                            println("Name: ${p7.Name}")
                            println("Blood Group: ${p7.BG}")
                            println("Address: ${p7.Address}")
                            println("Last Donate Date: ${p7.LDD}")
                            println()
                        }
                        if (check == p8.Name || check == p8.BG || check == p8.Address) {
                            count++
                            println("Id: ${p8.Id}")
                            println("Name: ${p8.Name}")
                            println("Blood Group: ${p8.BG}")
                            println("Address: ${p8.Address}")
                            println("Last Donate Date: ${p8.LDD}")
                            println()
                        }
                        if (check == p9.Name || check == p9.BG || check == p9.Address) {
                            count++
                            println("Id: ${p9.Id}")
                            println("Name: ${p9.Name}")
                            println("Blood Group: ${p9.BG}")
                            println("Address: ${p9.Address}")
                            println("Last Donate Date: ${p9.LDD}")
                            println()
                        }
                        if (check == p10.Name || check == p10.BG || check == p10.Address) {
                            count++
                            println("Id: ${p10.Id}")
                            println("Name: ${p10.Name}")
                            println("Blood Group: ${p10.BG}")
                            println("Address: ${p10.Address}")
                            println("Last Donate Date: ${p10.LDD}")
                            println()
                        }
                        if (check == p11.Name || check == p11.BG || check == p11.Address) {
                            count++
                            println("Id: ${p11.Id}")
                            println("Name: ${p11.Name}")
                            println("Blood Group: ${p11.BG}")
                            println("Address: ${p11.Address}")
                            println("Last Donate Date: ${p11.LDD}")
                            println()
                        }
                        if (check == p12.Name || check == p12.BG || check == p12.Address) {
                            count++
                            println("Id: ${p12.Id}")
                            println("Name: ${p12.Name}")
                            println("Blood Group: ${p12.BG}")
                            println("Address: ${p12.Address}")
                            println("Last Donate Date: ${p12.LDD}")
                            println()
                        }
                        if (check == p13.Name || check == p13.BG || check == p13.Address) {
                            count++
                            println("Id: ${p13.Id}")
                            println("Name: ${p13.Name}")
                            println("Blood Group: ${p13.BG}")
                            println("Address: ${p13.Address}")
                            println("Last Donate Date: ${p13.LDD}")
                            println()
                        }
                        if (check == p14.Name || check == p14.BG || check == p14.Address) {
                            count++
                            println("Id: ${p14.Id}")
                            println("Name: ${p14.Name}")
                            println("Blood Group: ${p14.BG}")
                            println("Address: ${p14.Address}")
                            println("Last Donate Date: ${p14.LDD}")
                            println()
                        }
                        if (check == p15.Name || check == p15.BG || check == p15.Address) {
                            count++
                            println("Id: ${p15.Id}")
                            println("Name: ${p15.Name}")
                            println("Blood Group: ${p15.BG}")
                            println("Address: ${p15.Address}")
                            println("Last Donate Date: ${p15.LDD}")
                            println()
                        }
                        if (check == p16.Name || check == p16.BG || check == p16.Address) {
                            count++
                            println("Id: ${p16.Id}")
                            println("Name: ${p16.Name}")
                            println("Blood Group: ${p16.BG}")
                            println("Address: ${p16.Address}")
                            println("Last Donate Date: ${p16.LDD}")
                            println()
                        }
                        if (check == p17.Name || check == p17.BG || check == p17.Address) {
                            count++
                            println("Id: ${p17.Id}")
                            println("Name: ${p17.Name}")
                            println("Blood Group: ${p17.BG}")
                            println("Address: ${p17.Address}")
                            println("Last Donate Date: ${p17.LDD}")
                            println()
                        }
                        if (check == p18.Name || check == p18.BG || check == p18.Address) {
                            count++
                            println("Id: ${p18.Id}")
                            println("Name: ${p18.Name}")
                            println("Blood Group: ${p18.BG}")
                            println("Address: ${p18.Address}")
                            println("Last Donate Date: ${p18.LDD}")
                            println()
                        }
                        if (check == p19.Name || check == p19.BG || check == p19.Address) {
                            count++
                            println("Id: ${p19.Id}")
                            println("Name: ${p19.Name}")
                            println("Blood Group: ${p19.BG}")
                            println("Address: ${p19.Address}")
                            println("Last Donate Date: ${p19.LDD}")
                            println()
                        }
                        if (check == p20.Name || check == p20.BG || check == p20.Address) {
                            count++
                            println("Id: ${p20.Id}")
                            println("Name: ${p20.Name}")
                            println("Blood Group: ${p20.BG}")
                            println("Address: ${p20.Address}")
                            println("Last Donate Date: ${p20.LDD}")
                            println()
                        }
                        if (check == p21.Name || check == p21.BG || check == p21.Address) {
                            count++
                            println("Id: ${p21.Id}")
                            println("Name: ${p21.Name}")
                            println("Blood Group: ${p21.BG}")
                            println("Address: ${p21.Address}")
                            println("Last Donate Date: ${p21.LDD}")
                            println()
                        }
                        if (check == p22.Name || check == p22.BG || check == p22.Address) {
                            count++
                            println("Id: ${p22.Id}")
                            println("Name: ${p22.Name}")
                            println("Blood Group: ${p22.BG}")
                            println("Address: ${p22.Address}")
                            println("Last Donate Date: ${p22.LDD}")
                            println()
                        }
                        if (check == p23.Name || check == p23.BG || check == p23.Address) {
                            count++
                            println("Id: ${p23.Id}")
                            println("Name: ${p23.Name}")
                            println("Blood Group: ${p23.BG}")
                            println("Address: ${p23.Address}")
                            println("Last Donate Date: ${p23.LDD}")
                            println()
                        }
                        if (check == p24.Name || check == p24.BG || check == p24.Address) {
                            count++
                            println("Id: ${p24.Id}")
                            println("Name: ${p24.Name}")
                            println("Blood Group: ${p24.BG}")
                            println("Address: ${p24.Address}")
                            println("Last Donate Date: ${p24.LDD}")
                            println()
                        }
                        if (check == p25.Name || check == p25.BG || check == p25.Address) {
                            count++
                            println("Id: ${p25.Id}")
                            println("Name: ${p25.Name}")
                            println("Blood Group: ${p25.BG}")
                            println("Address: ${p25.Address}")
                            println("Last Donate Date: ${p25.LDD}")
                            println()
                        }
                        if (check == p26.Name || check == p26.BG || check == p26.Address) {
                            count++
                            println("Id: ${p26.Id}")
                            println("Name: ${p26.Name}")
                            println("Blood Group: ${p26.BG}")
                            println("Address: ${p26.Address}")
                            println("Last Donate Date: ${p26.LDD}")
                            println()
                        }
                        if (check == p27.Name || check == p27.BG || check == p27.Address) {
                            count++
                            println("Id: ${p27.Id}")
                            println("Name: ${p27.Name}")
                            println("Blood Group: ${p27.BG}")
                            println("Address: ${p27.Address}")
                            println("Last Donate Date: ${p27.LDD}")
                            println()
                        }
                        if (check == p28.Name || check == p28.BG || check == p28.Address) {
                            count++
                            println("Id: ${p28.Id}")
                            println("Name: ${p28.Name}")
                            println("Blood Group: ${p28.BG}")
                            println("Address: ${p28.Address}")
                            println("Last Donate Date: ${p28.LDD}")
                            println()
                        }
                        if (check == p29.Name || check == p29.BG || check == p29.Address) {
                            count++
                            println("Id: ${p29.Id}")
                            println("Name: ${p29.Name}")
                            println("Blood Group: ${p29.BG}")
                            println("Address: ${p29.Address}")
                            println("Last Donate Date: ${p29.LDD}")
                            println()
                        }
                        if (check == p30.Name || check == p30.BG || check == p30.Address) {
                            count++
                            println("Id: ${p30.Id}")
                            println("Name: ${p30.Name}")
                            println("Blood Group: ${p30.BG}")
                            println("Address: ${p30.Address}")
                            println("Last Donate Date: ${p30.LDD}")
                            println()
                        }
                        if (check == p31.Name || check == p31.BG || check == p31.Address) {
                            count++
                            println("Id: ${p31.Id}")
                            println("Name: ${p31.Name}")
                            println("Blood Group: ${p31.BG}")
                            println("Address: ${p31.Address}")
                            println("Last Donate Date: ${p31.LDD}")
                            println()
                        }
                        if (check == p32.Name || check == p32.BG || check == p32.Address) {
                            count++
                            println("Id: ${p32.Id}")
                            println("Name: ${p32.Name}")
                            println("Blood Group: ${p32.BG}")
                            println("Address: ${p32.Address}")
                            println("Last Donate Date: ${p32.LDD}")
                            println()
                        }
                        if (check == p33.Name || check == p33.BG || check == p33.Address) {
                            count++
                            println("Id: ${p33.Id}")
                            println("Name: ${p33.Name}")
                            println("Blood Group: ${p33.BG}")
                            println("Address: ${p33.Address}")
                            println("Last Donate Date: ${p33.LDD}")
                            println()
                        }
                        if (check == p34.Name || check == p34.BG || check == p34.Address) {
                            count++
                            println("Id: ${p34.Id}")
                            println("Name: ${p34.Name}")
                            println("Blood Group: ${p34.BG}")
                            println("Address: ${p34.Address}")
                            println("Last Donate Date: ${p34.LDD}")
                            println()
                        }
                        if (check == p35.Name || check == p35.BG || check == p35.Address) {
                            count++
                            println("Id: ${p35.Id}")
                            println("Name: ${p35.Name}")
                            println("Blood Group: ${p35.BG}")
                            println("Address: ${p35.Address}")
                            println("Last Donate Date: ${p35.LDD}")
                            println()
                        }
                        if (check == p36.Name || check == p36.BG || check == p36.Address) {
                            count++
                            println("Id: ${p36.Id}")
                            println("Name: ${p36.Name}")
                            println("Blood Group: ${p36.BG}")
                            println("Address: ${p36.Address}")
                            println("Last Donate Date: ${p36.LDD}")
                            println()
                        }
                        if (check == p37.Name || check == p37.BG || check == p37.Address) {
                            count++
                            println("Id: ${p37.Id}")
                            println("Name: ${p37.Name}")
                            println("Blood Group: ${p37.BG}")
                            println("Address: ${p37.Address}")
                            println("Last Donate Date: ${p37.LDD}")
                            println()
                        }
                        if (check == p38.Name || check == p38.BG || check == p38.Address) {
                            count++
                            println("Id: ${p38.Id}")
                            println("Name: ${p38.Name}")
                            println("Blood Group: ${p38.BG}")
                            println("Address: ${p38.Address}")
                            println("Last Donate Date: ${p38.LDD}")
                            println()
                        }
                        if (check == p39.Name || check == p39.BG || check == p39.Address) {
                            count++
                            println("Id: ${p39.Id}")
                            println("Name: ${p39.Name}")
                            println("Blood Group: ${p39.BG}")
                            println("Address: ${p39.Address}")
                            println("Last Donate Date: ${p39.LDD}")
                            println()
                        }
                        if (check == p40.Name || check == p40.BG || check == p40.Address) {
                            count++
                            println("Id: ${p40.Id}")
                            println("Name: ${p40.Name}")
                            println("Blood Group: ${p40.BG}")
                            println("Address: ${p40.Address}")
                            println("Last Donate Date: ${p40.LDD}")
                            println()
                        }
                        if (check == p41.Name || check == p41.BG || check == p41.Address) {
                            count++
                            println("Id: ${p41.Id}")
                            println("Name: ${p41.Name}")
                            println("Blood Group: ${p41.BG}")
                            println("Address: ${p41.Address}")
                            println("Last Donate Date: ${p41.LDD}")
                            println()
                        }
                        if (check == p42.Name || check == p42.BG || check == p42.Address) {
                            count++
                            println("Id: ${p42.Id}")
                            println("Name: ${p42.Name}")
                            println("Blood Group: ${p42.BG}")
                            println("Address: ${p42.Address}")
                            println("Last Donate Date: ${p42.LDD}")
                            println()
                        }
                        if (check == p43.Name || check == p43.BG || check == p43.Address) {
                            count++
                            println("Id: ${p43.Id}")
                            println("Name: ${p43.Name}")
                            println("Blood Group: ${p43.BG}")
                            println("Address: ${p43.Address}")
                            println("Last Donate Date: ${p43.LDD}")
                            println()
                        }
                        if (check == p44.Name || check == p44.BG || check == p44.Address) {
                            count++
                            println("Id: ${p44.Id}")
                            println("Name: ${p44.Name}")
                            println("Blood Group: ${p44.BG}")
                            println("Address: ${p44.Address}")
                            println("Last Donate Date: ${p44.LDD}")
                            println()
                        }
                        if (check == p45.Name || check == p45.BG || check == p45.Address) {
                            count++
                            println("Id: ${p45.Id}")
                            println("Name: ${p45.Name}")
                            println("Blood Group: ${p45.BG}")
                            println("Address: ${p45.Address}")
                            println("Last Donate Date: ${p45.LDD}")
                            println()
                        }
                        if (check == p46.Name || check == p46.BG || check == p46.Address) {
                            count++
                            println("Id: ${p46.Id}")
                            println("Name: ${p46.Name}")
                            println("Blood Group: ${p46.BG}")
                            println("Address: ${p46.Address}")
                            println("Last Donate Date: ${p46.LDD}")
                            println()
                        }
                        if (check == p47.Name || check == p47.BG || check == p47.Address) {
                            count++
                            println("Id: ${p47.Id}")
                            println("Name: ${p47.Name}")
                            println("Blood Group: ${p47.BG}")
                            println("Address: ${p47.Address}")
                            println("Last Donate Date: ${p47.LDD}")
                            println()
                        }
                        if (check == p48.Name || check == p48.BG || check == p48.Address) {
                            count++
                            println("Id: ${p48.Id}")
                            println("Name: ${p48.Name}")
                            println("Blood Group: ${p48.BG}")
                            println("Address: ${p48.Address}")
                            println("Last Donate Date: ${p48.LDD}")
                            println()
                        }
                        if (check == p49.Name || check == p49.BG || check == p49.Address) {
                            count++
                            println("Id: ${p49.Id}")
                            println("Name: ${p49.Name}")
                            println("Blood Group: ${p49.BG}")
                            println("Address: ${p49.Address}")
                            println("Last Donate Date: ${p49.LDD}")
                            println()
                        }
                        if (check == p50.Name || check == p50.BG || check == p50.Address) {  //Bm Salauddin
                            count++
                            println("Id: ${p50.Id}")
                            println("Name: ${p50.Name}")
                            println("Blood Group: ${p50.BG}")
                            println("Address: ${p50.Address}")
                            println("Last Donate Date: ${p50.LDD}")
                            println()
                        }
                        println("${count} people matched")
                        println("Search Again: ")
                        //count=0


                    }
                } else {
                    println("Invalid Password")              //Syed Raihanuzzaman
                }

            }
        } else {
            println("Wrong User or Pass")
            println()
            println("Create an Account: ?")
            println("Press 1 or exit")



                var N:Int = read.nextInt()
                if (N == 1) {
                    println("Name: ")
                    val name:String = read.nextLine()
                    println("Blood Group: ")
                    val bgroup: String = read.nextLine()
                    println("Address: ")
                    var add: String = read.nextLine()
                    println("Phone Number: ")
                    var phone: Int = read.nextInt()
                    println("Last Donation Date: ")
                    var ldd: String = read.nextLine()                 //Syed Raihanuzzaman
                    println("Reg. Successful")

                }





        }


    }
}
