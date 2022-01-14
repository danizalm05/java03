
/*
https://courses.campus.gov.il/courses/course-v1:HUJI+ACD_RFP4_HUJI_OOP+2019_1/courseware/88ab077de1994b86bdb52ce07412c07c/487b27ce8fb94e4f9f141bff2836cf52/10?activate_block_id=block-v1%3AHUJI%2BACD_RFP4_HUJI_OOP%2B2019_1%2Btype%40vertical%2Bblock%4090301be6e7ad4c58b614e7c8212f4759


*/
 
 


class Board {

 public  static final int SIZE  = 6; 
 public  static final int WIN_STREAK = 4;
  
 public boolean putMark(Mark mark, int row, int col) {
	if(row < 0 || row >= SIZE || col < 0 || col >= SIZE )
	 return false;
    return true;
 }//putMarkputMark
 
  public Mark getMark ( int row, int col){
    if(row < 0 || row >= SIZE || col < 0 || col >= SIZE )
	 return Mark.BLANK;	  
   return Mark.O;
 }//
}