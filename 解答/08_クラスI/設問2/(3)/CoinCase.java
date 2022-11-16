/**
 * 小銭入れクラス
 *
 */
public class CoinCase {

	// 各硬貨の枚数
	private int yen500	= 0;
	private int yen100	= 0;
	private int yen50	= 0;
	private int yen10	= 0;
	private int yen5	= 0;
	private int yen1	= 0;

	/**
	 * 硬貨の追加
	 * @param kind 硬貨種類
	 * @param count 枚数
	 */
	public void addCoins(int kind, int count) {
		switch (kind) {
			case 500:
				yen500 += count;
				break;
			case 100:
				yen100 += count;
				break;
			case 50:
				yen50 += count;
				break;
			case 10:
				yen10 += count;
				break;
			case 5:
				yen5 += count;
				break;
			case 1:
				yen1 += count;
				break;
		}
	}

	/**
	 * 指定した硬貨の枚数を返す
	 * @param kind 硬貨種類
	 * @return 指定硬貨の枚数
	 */
	public int getCount(int kind) {
		switch (kind) {
			case 500:
				return yen500;
			case 100:
				return yen100;
			case 50:
				return yen50;
			case 10:
				return yen10;
			case 5:
				return yen5;
			case 1:
				return yen1;
		}
		return 0;
	}

	/**
	 * 全硬貨の枚数を返す
	 * @return 全硬貨の枚数
	 */
	public int getCount() {
		return yen500 + yen100 + yen50 + yen10 + yen5 + yen1;
	}

	/**
	 * 指定硬貨の総額を返す
	 * @param kind 硬貨種類
	 * @return 指定硬貨の総額
	 */
	public int getAmount(int kind) {
		switch (kind) {
			case 500:
				return yen500 * 500;
			case 100:
				return yen100 * 100;
			case 50:
				return yen50 * 50;
			case 10:
				return yen10 * 10;
			case 5:
				return yen5 * 5;
			case 1:
				return yen1 * 1;
		}
		return 0;
	}

	/**
	 * 総額を返す
	 * @return 総額
	 */
	public int getAmount() {
		return (yen500 * 500) + (yen100 * 100) + (yen50 * 50) + (yen10 * 10) + (yen5 * 5) + (yen1 * 1);
	}

}
