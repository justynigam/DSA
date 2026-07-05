class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1){
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>(numRows);
        for(int i = 0 ; i < numRows; i++){
            rows.add(new StringBuilder());
        }
        int row = 0;
        int step = 1;
 
        for(char ch : s.toCharArray()){
            rows.get(row).append(ch);

            if(row == 0){
                step = 1;
            }else if(row == numRows - 1){
                step = -1;
            }
            row += step;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder r : rows){
            res.append(r);
        }
        return res.toString();
    }
}