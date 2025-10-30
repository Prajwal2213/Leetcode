class reverse_num {
    public int reverse(int x) {
        int last_digit = 0;
        int final_X = 0;
        while( x != 0){
        last_digit = x % 10;
        if ( final_X> Integer.MAX_VALUE / 10 ||  final_X< Integer.MIN_VALUE / 10){
            return 0;
        }
        final_X = (final_X * 10) + last_digit;
        x = x / 10;
        }
       return final_X;
    }
}