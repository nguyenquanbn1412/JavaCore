import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //menuArrOption();


        //	static void menuArrOption() {
//		int m = 0;
//		int[] arr = null;
//		while (m != 5) {
//			System.out.println("**********MENU**********");
//			System.out.println("1. Khoi tao mang");
//			System.out.println("2. Nhap phan tu cho mang");
//			System.out.println("3. In mang ra man hinh");
//			System.out.println("4. Thay doi so chan trong mang (Neu co)");
//			System.out.println("5. Thoat");
//			Scanner scn = new Scanner(System.in);
//			m = scn.nextInt();
//			switch (m) {
//			case 1:
//				arr = initialArr(scn);
//				break;
//			case 2:
//				inputForArr(scn, arr);
//				break;
//			case 3:
//				printArr(arr);
//				break;
//			case 4:
//				changeArr(arr);
//				break;
//			case 5:
//				System.out.println("Good bye!");
//				break;
//			default:
//				System.out.println("Ban can nhap theo goi y cua menu!");
//				break;
//			}
//		}
//	}
//
//	static int[] initialArr(Scanner scn) {
//		System.out.println("Ban chuan bi khoi tao mang, hay nhap so phan tu cho mang: ");
//		int n = scn.nextInt();
//		return new int[n];
//	}
//
//	static void inputForArr(Scanner scn, int[] arr) {
//		if (arr.length > 0) {
//			System.out.println("Nhap tung phan tu cho mang:");
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = scn.nextInt();
//			}
//		} else {
//			System.out.println("Mang khong hop le!");
//		}
//
//	}
//
//	static void printArr(int[] arr) {
//		if (arr.length > 0) {
//			System.out.println("Mang sau khi da nhap phan tu:");
//			for (int j : arr) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		} else {
//			System.out.println("Mang khong hop le!");
//		}
//	}
//
//	static void changeArr(int[] arr) {
//		if (arr.length > 0) {
//			System.out.println("Mang sau khi tang cac so chan len 1 don vi:");
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] % 2 == 0) {
//					arr[i]++;
//				}
//				System.out.print(arr[i] + " ");
//			}
//			System.out.println();
//		} else {
//			System.out.println("Mang khong hop le!");
//		}
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Ruby");
        arrayList.add("C/C++");

        String[] array = new String[arrayList.size()];
        array = arrayList.toArray(array);
        for (
                String s : array) {
            System.out.println(s);
        }
    }
}

