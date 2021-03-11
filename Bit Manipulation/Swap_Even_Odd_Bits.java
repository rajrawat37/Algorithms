  // Get all even bits of x by doing bitwise and of x with 0xAAAAAAAA. The number 0xAAAAAAAA is a 32 bit number with all even bits set as 1 and all odd bits as 0.
  // Get all odd bits of x by doing bitwise and of x with 0x55555555. The number 0x55555555 is a 32 bit number with all odd bits set as 1 and all even bits as 0.
  // Right shift all even bits.
  // Left shift all odd bits.
  // Combine new even and odd bits and return

public static int swapBits(int n) {
  
	     return ((n&0x55555555)<<1)|((n&0xAAAAAAAA)>>1);
	    
	}
