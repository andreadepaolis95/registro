package excep;



    public class ConnectionError extends Exception {

        private static final int status = 500;



        public ConnectionError(){
            super();
        }

        public int getStatus() {
            return status;
        }
    }


