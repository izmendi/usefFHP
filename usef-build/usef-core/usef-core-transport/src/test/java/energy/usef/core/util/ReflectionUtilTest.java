/*
 * Copyright 2015 USEF Foundation
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

package energy.usef.core.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class ReflectionUtilTest extends TestCase {
    @Test
    public void testUtilityClass() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Assert.assertEquals("There must be only one constructor", 1, ReflectionUtil.class.getDeclaredConstructors().length);
        Constructor<ReflectionUtil> constructor = ReflectionUtil.class.getDeclaredConstructor();
        Assert.assertTrue("Constructor must be private", Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
        constructor.setAccessible(false);
    }

}
