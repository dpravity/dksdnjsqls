import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		//캐스팅 또는 y=wx로 입력값과 예측값을 토대로 대략적인 가중치 w를 0.5로 설정
		int tmp = (int) (d/2);
//		double w = 0.5;
//		int tmp = (int)Math.floor(w*d);
		System.out.println(tmp);
		return tmp;
	}

	static boolean quest2(String s) {
		//정규식으로 문자열과 매치 if~else로 구분
		Pattern p = Pattern.compile("\\(\\{\\}\\[\\]\\)");
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		if(b){
			System.out.println(b);
			return b;
		}else{
			System.out.println(b);
			return false;
		}
	}
}
