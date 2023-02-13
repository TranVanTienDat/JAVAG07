package buoi1;

public class btMang {
                                                                                                                                                                                                                                 
	
	
	public static float Tong(float[] mang) {
		int n= mang.length;
	    float s =0;
	    for(int i=0; i<n;i++) {
	    	s=s+mang[i];
	    }
		return s;
	}
	
	public static float[] MinMax(float[] mang) {
		float[] mma = new float[2];
		mma[0] = min(mang);
		mma[1] = max(mang);
		return mma;
	}
	
	static float min(float[] mang) {
		float m=mang[0];
		for(int i=0; i<mang.length;i++) {
			if(m < mang[i]) {
				m = mang[i];
			}
		}
		return m;
	}

static float max(float[] mang) {
	float m=mang[0];
	for(int i=0; i<mang.length;i++) {
		if(m > mang[i]) {
			m = mang[i];
		}
	}
	return m;
}

public static float SNT(float[] mang) {
	float s = 0;
	for (int i = 2; i <= mang.length; i++) {
		if(check(mang[i]))
			s+=mang[i];
	}
	return s;
}


// check co phai SNT
static boolean check(float a) {
	int n = (int) a;
	if(a == n) {
		if(n<2)
			return false;
		
		int sq = (int) Math.sqrt(n); 
		for (int i = 2; i <= sq; i++) { 
			if (n % i == 0) { return false; } 
			} 
		return true;
	}
	return false; 
	}
}
