import java.util.*;

class Worldcup {
	public static void main(String [] args)throws Exception{
		
		Opening();
		Menu();
		
	
	}
	
	static void Opening() throws Exception{
		
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		Thread.sleep(100);
		System.out.println("��                                                                                          ��");
		Thread.sleep(100);
		System.out.println("��     _|          _|  _|_|_|_|  _|          _|_|_|    _|_|    _|      _|  _|_|_|_|  _|     ��");
		Thread.sleep(100);
		System.out.println("��     _|          _|  _|        _|        _|        _|    _|  _|_|  _|_|  _|        _|     ��");
		Thread.sleep(100);
		System.out.println("��     _|    _|    _|  _|_|_|    _|        _|        _|    _|  _|  _|  _|  _|_|_|    _|     ��");
		Thread.sleep(100);
		System.out.println("��       _|  _|  _|    _|        _|        _|        _|    _|  _|      _|  _|               ��");
		Thread.sleep(100);
		System.out.println("��         _|  _|      _|_|_|_|  _|_|_|_|    _|_|_|    _|_|    _|      _|  _|_|_|_|  _|     ��");
		Thread.sleep(100);
		System.out.println("��                                                                                          ��");
		Thread.sleep(100);
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");	
	}
	static void Closing() throws Exception{
		
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		Thread.sleep(100);
		System.out.println("��                                                                                          ��");
		Thread.sleep(100);
		System.out.println("��    _|_|_|    _|_|    _|      _|  _|_|_|_|        _|_|    _|      _|  _|_|_|_|  _|_|_|    ��");
		Thread.sleep(100);
		System.out.println("��  _|        _|    _|  _|_|  _|_|  _|            _|    _|  _|      _|  _|        _|    _|  ��");
		Thread.sleep(100);
		System.out.println("��  _|  _|_|  _|_|_|_|  _|  _|  _|  _|_|_|        _|    _|  _|      _|  _|_|_|    _|_|_|    ��");
		Thread.sleep(100);
		System.out.println("��  _|    _|  _|    _|  _|      _|  _|            _|    _|    _|  _|    _|        _|    _|  ��");
		Thread.sleep(100);
		System.out.println("��    _|_|_|  _|    _|  _|      _|  _|_|_|_|        _|_|        _|      _|_|_|_|  _|    _|  ��");
		Thread.sleep(100);
		System.out.println("��                                                                                          ��");
		Thread.sleep(100);
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");	
	}
	static void Table() throws Exception{
		Thread.sleep(90);
		System.out.println("|  1.  �̻��� ������ 1��                                                                    |");
		Thread.sleep(90);
		System.out.println("|  2. '�̻��� ������' ���α׷� ����!                                                        |");
		
	}
	static void Menu()throws Exception{
		Scanner s = new Scanner(System.in);
		Wc w = new Wc();
		int num;
		Thread.sleep(500);
		System.out.println(" ============================================================================================ ");
		Table();
		System.out.println(" ============================================================================================ ");
		Thread.sleep(100);
		System.out.print("|  � ���� ���� �Ͻðٽ��ϱ�?(1,2) ");
		num = s.nextInt();
		System.out.println();
		if(num!=1&&num!=2){
			for(int i=0 ; i <3 ; i++){
				System.out.print(" �ڡڡڡڡڡ�[ �Է� ����!!]�ڡڡڡڡڡ� ");
				Thread.sleep(100);
				System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
				Thread.sleep(100);
				System.out.print(" �١١١١١�[ �Է� ����!!]�١١١١١� ");
				Thread.sleep(100);
				System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
				Thread.sleep(100);
			}
			System.out.println(" �ڡڡڡڡڡ�[ �Է� ����!!]�ڡڡڡڡڡ� \n");
			Menu();
		}else if(num==1) w.wc_16();
		else Closing();
		
	}
	
} 

class Wc{
	public static ArrayList<Integer> indexes = new ArrayList<>();
	public static String [] names = {"����","���̾�","�º���","��Ű���콺","�Ƿη�","�ɽ�","��� ���� ��ü","�޸�?","����","¯��","�ÿ�","������","�޸�?","���󿡸�","������","��ö��"};
	public static int[] index_init = new int[16];
	public static String[] files = {"1.txt","2.txt","3.txt","4.txt","5.txt","6.txt","7.txt","8.txt","9.txt","10.txt","11.txt","12.txt","13.txt","14.txt","15.txt","16.txt"};
	Wc(){
		for(int i=0; i<index_init.length; i++){
			index_init[i] = i;
		}
	}
	public void wc_16() throws Exception{
		suffle();
		int n = 1 ;
		int index = 0;
		while( n<=8 ){
			int i = indexes.get(index);
			int j = indexes.get(index+1);
			System.out.println(" -------------------------------------------------------------------------------------------- ");
			System.out.printf("| ��16Round %dth Match��                                                                     |\n",n);
			Thread.sleep(500);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n-1);
			Thread.sleep(100);
			print_img(i);
			System.out.println(names[i]);
			Thread.sleep(1000);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n);
			Thread.sleep(100);
			print_img(j);
			System.out.println(names[j]);
			Thread.sleep(500);
			int win = choice(i, j);
			if(win == i)
				indexes.remove(index+1);
			else
				indexes.remove(index);
			n++;
			index++;
		}
		Thread.sleep(200);
		System.out.println(" ============================================================================================ ");
		BBuBBa();
		wc_8();
	}
	public void wc_8() throws Exception{
		int n = 1 ;
		int index = 0;
		while( n<=4 ){
			int i = indexes.get(index);
			int j = indexes.get(index+1);
			System.out.println(" ------------------------------------------------------------------------------------------- ");
			System.out.printf(" ��8Round %dth Match��                                    \n",n);
			Thread.sleep(500);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n-1);
			Thread.sleep(100);
			print_img(i);
			System.out.println(names[i]);
			Thread.sleep(1000);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n);
			Thread.sleep(100);
			print_img(j);
			System.out.println(names[j]);
			Thread.sleep(500);
			int win = choice(i, j);
			if(win == i)
				indexes.remove(index+1);
			else
				indexes.remove(index);
			n++;
			index++;
		}
		Thread.sleep(200);
		System.out.println(" ============================================================================================ ");
		BBuBBa();
		wc_4();
	}
	public void wc_4() throws Exception{
		int n = 1 ;
		int index = 0;
		while( n<=2 ){
			int i = indexes.get(index);
			int j = indexes.get(index+1);
			System.out.println(" -------------------------------------------------------------------------------------------- ");
			System.out.printf(" ��Semi-Final %dth Match��                             \n",n);
			Thread.sleep(500);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n-1);
			Thread.sleep(100);
			print_img(i);
			System.out.println(names[i]);
			Thread.sleep(1000);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n);
			Thread.sleep(100);
			print_img(j);
			System.out.println(names[j]);
			Thread.sleep(500);
			int win = choice(i, j);
			if(win == i)
				indexes.remove(index+1);
			else
				indexes.remove(index);
			n++;
			index++;
		}
		Thread.sleep(200);
		System.out.println(" ============================================================================================ ");
		BBuBBa();
		wc_f();
	}
	public void wc_f() throws Exception{
		int n = 1 ;
		int index = 0;
		while( n<=1 ){
			int i = indexes.get(index);
			int j = indexes.get(index+1);
			System.out.println(" ��FINAL MATCH!!��                                   ");
			Thread.sleep(500);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n-1);
			Thread.sleep(100);
			print_img(i);
			System.out.println(names[i]);
			Thread.sleep(1000);
			System.out.printf("\n\n|  ��NUMBER %d��                                                                             |\n", 2*n);
			Thread.sleep(100);
			print_img(j);
			System.out.println(names[j]);
			Thread.sleep(500);
			int win = choice(i, j);
			if(win == i)
				indexes.remove(index+1);
			else
				indexes.remove(index);
			n++;
			index++;
		}
		Thread.sleep(200);
		System.out.println(" ============================================================================================ ");
		wc_w();
	}
	public void wc_w() throws Exception{
		int i = indexes.get(0);
		for(int k = 0; k <3 ; k++){
			System.out.print("  �ڡڡڡڡڡ�THE WINNER�ڡڡڡڡڡ� ");
			Thread.sleep(200);
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
			System.out.print("  �١١١١١�THE WINNER�١١١١١� ");
			Thread.sleep(200);
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");	
		}
		System.out.print("  �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.print("�ڡڡڡڡڡ�THE WINNER�ڡڡڡڡڡ�");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ");
		Thread.sleep(500);
		print_img(i);
		System.out.println(names[i]);
	}
	public int choice(int i, int j) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("|  CHOOSE 1 or 2 : ");
		int win = sc.nextInt();
		if( win == 1 )
			return i;
		else
			return j;
	}
	
	public void suffle() throws Exception{
		//suffling
		for(int i = 0; i < index_init.length; i++) {
			int j = (int)(Math.random()*index_init.length);
			int temp = index_init[i];
			index_init[i] = index_init[j]; 
			index_init[j] = temp;
		}
		//initializing
		for(int i = 0; i < index_init.length; i++) {
			indexes.add(index_init[i]);
		}
	}
	
	public void BBuBBa() throws Exception{
		for(int i = 0; i <3 ; i++){
			System.out.print("  �ڡڡڡڡڡڻѼ������Ѽ������ڡڡڡڡڡ� ");
			Thread.sleep(200);
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
			System.out.print("  �١١١١١ٻѼ������Ѽ������١١١١١� ");
			Thread.sleep(200);
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");	
			
		}
	}
	public void print_img(int i) throws Exception{
		java.io.File file = new java.io.File(files[i]);
		try(
			Scanner input = new Scanner(file);
		){
			while(input.hasNext()){
				String line = input.nextLine();
				System.out.println(line);
			}
		}
	}
}