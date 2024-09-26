 public class NumWordPrinter {
        int num;
        boolean string;
        public NumWordPrinter() {
            this.num = num;
            this.string = string;
        }
        public String printWord(int num, boolean string) {
            String  value;


            if (num % 2 == 0 && num % 11 == 0 && num % 13 == 0) {
                value = "EvenPrimeLucky";
            } else if (num % 2 == 0 && num % 11 == 0) {
                value = "EvenPrimeEleven";
            } else if (num % 2 == 0) {
                value = "Even";
            } else if (num % 11 == 0) {
                value = "PrimeEleven";
            } else if (num % 13 == 0) {
                value = "LuckyThirteen";
            } else {
                value = "OddOneOut";
            }


            if (string) {
                value = value.toUpperCase();
            }

            return value;
        }

    }
