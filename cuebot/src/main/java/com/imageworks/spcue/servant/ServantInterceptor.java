
/*
 * Copyright (c) 2018 Sony Pictures Imageworks Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



package com.imageworks.spcue.servant;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public final class ServantInterceptor {
    private static final Logger logger = Logger.getLogger("API");

    public static void __dispatch(Ice.ObjectImpl servant,
            IceInternal.Incoming in, Ice.Current current) {
        logger.info(String.format("%s:%s", current.operation,
                StringUtils.join(current.ctx.values(), ":")));
    }
}

