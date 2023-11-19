package lotto.domain

import lotto.error.InvalidLottoAmountException
import lotto.error.InvalidLottoNumberException

class LottoShop(
    private val price: Amount = Amount(1000)
) {

    fun purchase(amount: Amount, manualLottoNumbers: List<LottoNumber>): LottoTicket {
        val autoLottoNumbers = List(calculateAutoLottoCount(amount, manualLottoNumbers.size)) {
            LottoNumberGenerator.createFrom()
        }
        return LottoTicket(manualLottoNumbers + autoLottoNumbers)
    }

    fun receivePrize(ticket: LottoTicket, winningLotto: WinningLotto): LottoResult =
        LottoResult.of(winningLotto, ticket, price)

    private fun calculateAutoLottoCount(amount: Amount, manualLottoNumberCount: Int): Int {
        require(amount % price == 0) { throw InvalidLottoAmountException() }
        val totalCount = amount / price
        require(totalCount >= manualLottoNumberCount) { "수동 구입 로또 수가 구매 금액으로 구입할 수 있는 로또 수보다 큽니다" }
        return totalCount - manualLottoNumberCount
    }
}
