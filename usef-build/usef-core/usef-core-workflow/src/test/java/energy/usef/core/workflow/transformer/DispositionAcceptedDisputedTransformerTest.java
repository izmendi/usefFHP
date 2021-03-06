/*
 * Copyright 2015-2016 USEF Foundation
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

package energy.usef.core.workflow.transformer;

import energy.usef.core.data.xml.bean.message.DispositionAcceptedDisputed;
import energy.usef.core.workflow.dto.DispositionAcceptedDisputedDto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

public class DispositionAcceptedDisputedTransformerTest {

    @Test
    public void testUtilityClass() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Assert.assertEquals("There must be only one constructor", 1, DispositionAcceptedDisputedTransformer.class.getDeclaredConstructors().length);
        Constructor<DispositionAcceptedDisputedTransformer> constructor = DispositionAcceptedDisputedTransformer.class.getDeclaredConstructor();
        Assert.assertTrue("Constructor must be private", Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
        constructor.setAccessible(false);
    }

    @Test
    public void testTransformToXmlWithDisputed() throws Exception {
        DispositionAcceptedDisputed disposition = DispositionAcceptedDisputedTransformer.transformToXml(
                DispositionAcceptedDisputedDto.DISPUTED);
        Assert.assertEquals(DispositionAcceptedDisputed.DISPUTED, disposition);
    }

    @Test
    public void testTransformToXmlWithAccepted() throws Exception {
        DispositionAcceptedDisputed disposition = DispositionAcceptedDisputedTransformer.transformToXml(
                DispositionAcceptedDisputedDto.ACCEPTED);
        Assert.assertEquals(DispositionAcceptedDisputed.ACCEPTED, disposition);
    }

    @Test
    public void testTransformToXmlWithBull() throws Exception {
        DispositionAcceptedDisputed disposition = DispositionAcceptedDisputedTransformer.transformToXml(null);
        Assert.assertNull(disposition);
    }

    @Test
    public void testTransformWithAccepted() throws Exception {
        DispositionAcceptedDisputedDto disposition = DispositionAcceptedDisputedTransformer.transform(
                DispositionAcceptedDisputed.ACCEPTED);
        Assert.assertEquals(DispositionAcceptedDisputedDto.ACCEPTED, disposition);
    }

    @Test
    public void testTransformWithDisputed() throws Exception {
        DispositionAcceptedDisputedDto disposition = DispositionAcceptedDisputedTransformer.transform(
                DispositionAcceptedDisputed.DISPUTED);
        Assert.assertEquals(DispositionAcceptedDisputedDto.DISPUTED, disposition);
    }

    @Test
    public void testTransformWithNull() throws Exception {
        DispositionAcceptedDisputedDto disposition = DispositionAcceptedDisputedTransformer.transform(null);
        Assert.assertNull(disposition);
    }
}
