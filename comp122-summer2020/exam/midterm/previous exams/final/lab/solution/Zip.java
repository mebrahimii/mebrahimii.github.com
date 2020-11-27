public class Zip {
    public static void main(String[] args) {
	int[] first_array = new int[]{10, 3, 8, 18};
	int[] second_array = new int[]{4, 32, 9, 7};
	int[] result_array = new int[8];
	int first_second_length = 4;

	int r0 = 0;
	int r1 = 0;

	while (r0 < first_second_length) {
	    result_array[r1] = first_array[r0];
	    result_array[r1 + 1] = second_array[r0];
	    r0 = r0 + 1;
	    r1 = r1 + 2;
	}

	for (int x = 0; x < first_second_length * 2; x++) {
	    System.out.println(result_array[x]);
	}
    }
}

