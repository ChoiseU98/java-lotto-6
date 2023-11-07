package lotto.view;

import java.util.List;

public class LottoView {

    private String inputBuyLottoMoneyMessage = "구입금액을 입력해 주세요.";
    private String lottoCountMessage = "개를 구매했습니다.";
    private String inputWinningNumberMessage = "당첨 번호를 입력해 주세요.";
    private String inputBonusNumberMessage = "보너스 번호를 입력해 주세요.";

    public void printBuyLottomMoneyMessage() {
        System.out.println(inputBuyLottoMoneyMessage);
    }

    public void printLottoTicketCount(int lottoCount) {
        printEnterLine();
        System.out.println(lottoCount + lottoCountMessage);
    }

    public void printLottoNumbers(List<List<Integer>> lottos) {
        lottos.forEach(lottoNumbers -> {
            System.out.println(lottoNumbers.toString());
        });
    }

    public void printEnterLine() {
        System.out.println();
    }

    public void printWinningNumberMessage() {
        printEnterLine();
        System.out.println(inputWinningNumberMessage);
    }

    public void printBonusNumberMessage() {
        System.out.println(inputBonusNumberMessage);
    }

}
