import java.util.Stack;

    class MaxStack {
        private Stack<Integer> MainStack;
        private Stack<Integer> MaxStack;
        private Stack<Integer> MinStack;

        public MaxStack() {
            MainStack = new Stack<>();
            MaxStack = new Stack<>();
            MinStack = new Stack<>();
        }

        public void push(int x) {
            MainStack.push(x);

            if (MaxStack.isEmpty() || x >= MaxStack.peek()) {
                MaxStack.push(x);
            }

            if (MinStack.isEmpty() || x <= MinStack.peek()) {
                MinStack.push(x);
            }
        }


        public int pop() {
            if (MainStack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            int poppedValue = MainStack.pop();

            if (poppedValue == MaxStack.peek()) {
                MaxStack.pop();
            }

            if (poppedValue == MinStack.peek()) {
                MinStack.pop();
            }

            return poppedValue;
        }

        public int max() {
            if (MaxStack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return MaxStack.peek();
        }

        

        public static void main(String[] args) {
            MaxStack stack = new MaxStack();
            MaxStack maxStack = new MaxStack();


            stack.push(3);
            stack.push(2);
            stack.push(5);
            stack.push(6);
            System.out.println("Max: " + stack.max());


            stack.pop();
            System.out.println("Max after pop: " + stack.max());



            maxStack.push(1);
            maxStack.push(2);
            maxStack.push(3);
            maxStack.push(2);
            System.out.println("Max: " + maxStack.max());

        }

    }
