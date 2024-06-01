package Supplier;

import java.util.function.Supplier;

public class Demo {
	public static void main(String[] args) {
		Supplier<String> s=() -> {
			String otp="";
			for(int i=1; i<=5; i++) {
				otp=otp +(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println("OTP IS  -"+s.get());
		System.out.println("OTP IS  -"+s.get());
		System.out.println("OTP IS  -"+s.get());
		System.out.println("OTP IS  -"+s.get());
		System.out.println("OTP IS  -"+s.get());
		System.out.println("OTP IS  -"+s.get());
		System.out.println("OTP IS  -"+s.get());
		System.out.println("HashCode is  -"+s.hashCode());
	}

}
