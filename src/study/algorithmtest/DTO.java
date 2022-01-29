package study.algorithmtest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DTO {

	HashMap<Integer, String> product = new HashMap<Integer, String>();

	public void insert(int proNo, String proName) {
		product.put(proNo, proName);
	}

	public void delete(int proNo) {
		product.remove(proNo);
		System.out.println("상품 삭제 완료");
	}

	public void select(int proNo) {
		System.out.print("상품명 : " + product.get(proNo));
		System.out.println();
	}

	public void selectAll() {
		Set set = product.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry e = (Map.Entry)iter.next();
			System.out.println( e.getKey() + " " + e.getValue());
		}
		
		if(!iter.hasNext()) {
			System.out.println("등록된 상품이 없습니다.");
		}
	}
}
