package fund.cyber.markets.tickers.model

import fund.cyber.markets.dto.TokensPair
import java.sql.Timestamp

data class TickerKey(
        val tokensPair: TokensPair,
        val windowDuration: Long,
        val timestamp: Timestamp
)