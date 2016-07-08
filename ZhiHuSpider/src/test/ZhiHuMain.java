package test;

import java.util.ArrayList;
import bean.ZhiHuPicBean;
import mothed.FileReaderWriter;

/**
 * 鎶撳彇鐭ヤ箮鍥剧墖骞朵笅杞� 鎶撳彇鐭ヤ箮鎺ㄨ崘鍐呭骞跺啓鍏ユ湰鍦�
 * 
 * @author KKys
 *
 */
public class ZhiHuMain {

	public static void main(String[] args) throws Exception {
		/**
		 * 鐖煡涔庡浘鐗囷紝骞朵笅杞藉埌鏈湴
		 */
		// 瀹氫箟鍗冲皢璁块棶鐨勯摼鎺�
		String url = "https://www.zhihu.com/question/20300634";
		// 鏋勯�犳柟娉曚紶url锛岃幏鍙朲hiHuPicBean
		ZhiHuPicBean myZhihu = new ZhiHuPicBean(url);
		// 鑾峰彇ZhiHuPicBean涓殑鍥剧墖鍒楄〃
		ArrayList<String> picList = myZhihu.getZhihuPicUrl();
		// 鎵撳嵃缁撴灉
		System.out.println("");
		System.out.println("鏍囬锛�" + myZhihu.getQuestion());
		System.out.println("");
		// 寰幆锛屽湪鎺у埗鍙版墦鍗板浘鐗囧湴鍧�
		for (String zhiHuPic : picList) {
			System.out.println(zhiHuPic);
		}
		System.out.println("");
		//瀹氫箟涓嬭浇璺緞
		String addr = "D:/鐭ヤ箮鐖櫕/";
		System.out.println("鍗冲皢寮�濮嬩笅杞藉浘鐗囧埌"+addr+myZhihu.getQuestion());
		System.out.println("");
		System.out.println("寮�濮嬩笅杞�................");
		System.out.println("");
		// 鎶婂浘鐗囦笅杞藉埌鏈湴鏂囦欢澶�
		FileReaderWriter.downLoadPics(myZhihu, addr);
		System.out.println("");
		System.out.println("鍥剧墖涓嬭浇瀹屾瘯锛岃鍒�"+addr+myZhihu.getQuestion()+"閲屽幓鐪嬬湅鍚э紒锛侊紒");

		/**
		 * 鐖煡涔庢帹鑽愮殑鍐呭
		 */
		// // 瀹氫箟鍗冲皢璁块棶鐨勯摼鎺�
		// String url = "https://www.zhihu.com/explore/recommendations";
		// // 璁块棶閾炬帴骞惰幏鍙栭〉闈㈠唴瀹�
		// String content = Spider.SendGet(url);
		// // 鑾峰彇璇ラ〉闈㈢殑鎵�鏈夌殑鐭ヤ箮瀵硅薄
		// ArrayList<ZhiHuBean> myZhihu = Spider.GetRecommendations(content);
		// for (ZhiHuBean zhihu : myZhihu) {
		// FileReaderWriter.writeIntoFile(zhihu.writeString(),"D:/鐭ヤ箮缂栬緫鎺ㄨ崘.txt",
		// true);
		// }
	}
}
