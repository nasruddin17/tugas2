public class main {


	public static void main(String[] args) {

		System.out.println("------Object Kelas Kotak------");

		// membuat object dari class kotak

		KOTAK main = new KOTAK();


		// method setter kotak

		main.setPanjang(15.20);

		main.setLebar(4.56);


		// method getter kotak

		System.out.println("panjang : " + main.getPanjang());

		System.out.println("lebar : " + main.getLebar());

		System.out.println("luas : " + main.getPanjang()*main.getLebar());

		System.out.println("keliling : " + main.getLebar()*main.getPanjang()*main.getLebar()*main.getPanjang());


		System.out.println("------Object Kelas mahasiswa------");

		//membuat object dari class mahasiswa

		Mahasiswa mahasiswa = new Mahasiswa();


		//method setter mahasiswa

		mahasiswa.setNama ("ALIEF TAUFIK");

		mahasiswa.setNim ("D0217385");

		mahasiswa.setAlamat ("SALEPPA");

		mahasiswa.setGolongandarah ("B");

		mahasiswa.setStatus ("pelajar");

		mahasiswa.setTinggibadan (165);

		mahasiswa.setBeratbadan (47);


		//method getter mahasiswa

		System.out.println("nama : " + mahasiswa.getNama());

		System.out.println("nim : " + mahasiswa.getNim());

		System.out.println("alamat : " + mahasiswa.getAlamat());

		System.out.println("golongan Darah : " + mahasiswa.getGolongandarah());

		System.out.println("Status : " + mahasiswa.getStatus());

		System.out.println("tinggi badan : " + mahasiswa.getTinggibadan());

		System.out.println("berat badan : " + mahasiswa.getBeratbadan());


		System.out.println("------Object Kelas node------");

		//membuat object dari kelas node

		Node node = new Node();


		//method setter node

		node.setLabel ("ALIEF");

		node.setValue (1);


		//method getter node

		System.out.println("Nama Label : " + node.getLabel());

		System.out.println("jumlah label : " + node.getValue());


		System.out.println("------Object Kelas stack------");

		//membuat object dari kelas stack

		Stack data1 = new Stack (); 

		data1.total(100);

		data1.setpush("buku1");data1.setpush("buku2");data1.setpush("buku3");data1.setpush("buku4");data1.setpush("buku5");data1.setpush("buku6");data1.setpush("buku7");data1.setpush("buku8");data1.setpush("buku9");data1.setpush("buku10");

		data1.setpush("kertas");data1.setpush("kertas2");data1.setpush("kertas3");data1.setpush("kertas4");data1.setpush("kertas5");data1.setpush("kertas6");data1.setpush("kertas7");data1.setpush("kertas8");data1.setpush("kertas9");data1.setpush("kertas10");

		data1.setpush("buku11");data1.setpush("buku12");data1.setpush("buku13");data1.setpush("buku14");data1.setpush("buku15");data1.setpush("buku16");data1.setpush("buku16");data1.setpush("buku18");data1.setpush("buku19");data1.setpush("buku20");

		data1.setpush("buku21");data1.setpush("buku22");data1.setpush("buku23");data1.setpush("buku24");data1.setpush("buku25");data1.setpush("buku26");data1.setpush("buku27");data1.setpush("buku28");data1.setpush("buku29");data1.setpush("buku30");

		data1.setpush("buku31");data1.setpush("buku32");data1.setpush("buku33");data1.setpush("buku34");data1.setpush("buku35");data1.setpush("buku36");data1.setpush("buku37");data1.setpush("buku38");data1.setpush("buku39");data1.setpush("buku40");

		data1.setpush("buku141");data1.setpush("buku42");data1.setpush("buku43");data1.setpush("buku44");data1.setpush("buku45");data1.setpush("buku46");data1.setpush("buku47");data1.setpush("buku48");data1.setpush("buku49");data1.setpush("buku50");

		data1.setpush("kertas11");data1.setpush("kertas12");data1.setpush("kertas13");data1.setpush("kertas14");data1.setpush("kertas15");data1.setpush("kertas16");data1.setpush("kertas17");data1.setpush("kertas18");data1.setpush("kertas19");data1.setpush("kertas20");

		data1.setpush("buku51");data1.setpush("buku52");data1.setpush("buku53");data1.setpush("buku54");data1.setpush("buku55");data1.setpush("buku56");data1.setpush("buku57");data1.setpush("buku58");data1.setpush("buku59");data1.setpush("buku60");

		data1.setpush("buku61");data1.setpush("buku62");data1.setpush("buku63");data1.setpush("buku64");data1.setpush("buku65");data1.setpush("buku66");data1.setpush("buku67");data1.setpush("buku68");data1.setpush("buku69");data1.setpush("buku70");

		data1.setpush("buku71");data1.setpush("buku72");data1.setpush("buku73");data1.setpush("buku74");data1.setpush("buku75");data1.setpush("buku76");data1.setpush("buku77");data1.setpush("buku78");data1.setpush("buku79");data1.setpush("buku80");

		data1.setpush("buku81");


		//menampilkan stack

		System.out.print("total stack adalah : "+data1.gettotal());	

	}
}
