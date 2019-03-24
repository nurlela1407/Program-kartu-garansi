public class ProgramKartugaransi{
	public static void main (String[] args){
		KartuGaransi kartugaransi = new KartuGaransi(args[0], args[1], args[2],args[3], args[4], args[5],args[6], args[7], args[8], 
		args[9], args[10], args[11]);
	String jenis_produk = kartugaransi.getJenis_produk();
	String no_produk = kartugaransi.getNo_produk();
	String tgl_pembelian = kartugaransi.getTgl_pembelian();
	String no_seri = kartugaransi.getNo_seri();
	String nama_perusahaan = kartugaransi.getNama_perusahaan();
	String nama_pelanggan = kartugaransi.getNama_pelanggan();
	String alamat_pelanggan = kartugaransi.getAlamat_pelanggan();
	String nohp_pelanggan = kartugaransi.getNohp_pelanggan();
	String email_pelanggan = kartugaransi.getEmail_pelanggan();
	String nama_penjual = kartugaransi.getNama_penjual();
	String alamat_penjual = kartugaransi.getAlamat_penjual();
	String nohp_penjual = kartugaransi.getNohp_penjual();
	
	System.out.println("Jenis Produk\t\t: "+(jenis_produk));
	System.out.println("No Produk\t\t: "+(no_produk));
	System.out.println("Tanggal Pembelian\t: "+(tgl_pembelian));
	System.out.println("No Seri\t\t\t: "+(no_seri));
	System.out.println("Nama perusahaan\t\t: "+(nama_perusahaan));
	System.out.println("Nama pelanggan\t\t: "+(nama_pelanggan));
	System.out.println("Alamat Pelanggan\t: "+(alamat_pelanggan));
	System.out.println("No Hp Pelanggan\t\t: "+(nohp_pelanggan));
	System.out.println("Email Pelanggan\t\t: "+(email_pelanggan));
	System.out.println("Nama Penjual\t\t: "+(nama_penjual));
	System.out.println("Alamat Penjual\t\t: "+(alamat_penjual));
	System.out.println("No Hp Penjual\t\t: "+(nohp_penjual));
	}
}