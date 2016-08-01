/**
 * Copyright 2016 Lucio Benfante <lucio.benfante@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.benfante.paypal.ipnassistant;

/**
 * A base implementation of {@link IpnMessage}.
 *
 * @author <a href="mailto:lucio.benfante@gmail.com">Lucio Benfante</a>
 */
public class IpnMessageBase implements IpnMessage {
    private final String transactionId;
    private final String paymentStatus;
    private final IpnData source;

    public IpnMessageBase(String transactionId, String paymentStatus, IpnData source) {
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.source = source;
    }

    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    @Override
    public String getPaymentStatus() {
        return this.paymentStatus;
    }
    
    public IpnData getSource() {
        return this.source;
    }
    
}
