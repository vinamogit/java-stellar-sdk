package org.stellar.sdk.responses;

import org.stellar.sdk.responses.effects.EffectResponse;
import org.stellar.sdk.responses.operations.OperationResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonSingleton {
  private static Gson instance = null;

  protected GsonSingleton() {}

  public static Gson getInstance() {
    if (instance == null) {
      TypeToken<Page<AccountResponse>> accountPageType = new TypeToken<Page<AccountResponse>>() {};
      TypeToken<Page<AssetResponse>> assetPageType = new TypeToken<Page<AssetResponse>>() {};
      TypeToken<Page<EffectResponse>> effectPageType = new TypeToken<Page<EffectResponse>>() {};
      TypeToken<Page<LedgerResponse>> ledgerPageType = new TypeToken<Page<LedgerResponse>>() {};
      TypeToken<Page<LiquidityPoolResponse>> liquidityPoolPageType = new TypeToken<Page<LiquidityPoolResponse>>() {};
      TypeToken<Page<OfferResponse>> offerPageType = new TypeToken<Page<OfferResponse>>() {};
      TypeToken<Page<OperationResponse>> operationPageType = new TypeToken<Page<OperationResponse>>() {};
      TypeToken<Page<PathResponse>> pathPageType = new TypeToken<Page<PathResponse>>() {};
      TypeToken<Page<TradeResponse>> tradePageType = new TypeToken<Page<TradeResponse>>() {};
      TypeToken<Page<TradeAggregationResponse>> tradeAggregationPageType = new TypeToken<Page<TradeAggregationResponse>>() {};
      TypeToken<Page<TransactionResponse>> transactionPageType = new TypeToken<Page<TransactionResponse>>() {};
      TypeToken<Page<ClaimableBalanceResponse>> claimableBalancePageType = new TypeToken<Page<ClaimableBalanceResponse>>() {};

      instance = new GsonBuilder()
                      .registerTypeAdapter(TransactionResponse.class, new TransactionDeserializer())
                      .registerTypeAdapter(accountPageType.getType(), new PageDeserializer<AccountResponse>(accountPageType))
                      .registerTypeAdapter(assetPageType.getType(), new PageDeserializer<AssetResponse>(assetPageType))
                      .registerTypeAdapter(effectPageType.getType(), new PageDeserializer<EffectResponse>(effectPageType))
                      .registerTypeAdapter(ledgerPageType.getType(), new PageDeserializer<LedgerResponse>(ledgerPageType))
                      .registerTypeAdapter(liquidityPoolPageType.getType(), new PageDeserializer<LiquidityPoolResponse>(liquidityPoolPageType))
                      .registerTypeAdapter(offerPageType.getType(), new PageDeserializer<OfferResponse>(offerPageType))
                      .registerTypeAdapter(operationPageType.getType(), new PageDeserializer<OperationResponse>(operationPageType))
                      .registerTypeAdapter(pathPageType.getType(), new PageDeserializer<PathResponse>(pathPageType))
                      .registerTypeAdapter(tradePageType.getType(), new PageDeserializer<TradeResponse>(tradePageType))
                      .registerTypeAdapter(tradeAggregationPageType.getType(), new PageDeserializer<TradeAggregationResponse>(tradeAggregationPageType))
                      .registerTypeAdapter(transactionPageType.getType(), new PageDeserializer<TransactionResponse>(transactionPageType))
                      .registerTypeAdapter(claimableBalancePageType.getType(), new PageDeserializer<ClaimableBalanceResponse>(claimableBalancePageType))
                      .create();
    }
    return instance;
  }

}
