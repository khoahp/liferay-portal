/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service.persistence;

/**
 * <a href="ExpandoTableUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class ExpandoTableUtil {
	public static com.liferay.portal.model.ExpandoTable create(long tableId) {
		return getPersistence().create(tableId);
	}

	public static com.liferay.portal.model.ExpandoTable remove(long tableId)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().remove(tableId);
	}

	public static com.liferay.portal.model.ExpandoTable remove(
		com.liferay.portal.model.ExpandoTable expandoTable)
		throws com.liferay.portal.SystemException {
		return getPersistence().remove(expandoTable);
	}

	public static com.liferay.portal.model.ExpandoTable update(
		com.liferay.portal.model.ExpandoTable expandoTable)
		throws com.liferay.portal.SystemException {
		return getPersistence().update(expandoTable);
	}

	public static com.liferay.portal.model.ExpandoTable update(
		com.liferay.portal.model.ExpandoTable expandoTable, boolean merge)
		throws com.liferay.portal.SystemException {
		return getPersistence().update(expandoTable, merge);
	}

	public static com.liferay.portal.model.ExpandoTable updateImpl(
		com.liferay.portal.model.ExpandoTable expandoTable, boolean merge)
		throws com.liferay.portal.SystemException {
		return getPersistence().updateImpl(expandoTable, merge);
	}

	public static com.liferay.portal.model.ExpandoTable findByPrimaryKey(
		long tableId)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().findByPrimaryKey(tableId);
	}

	public static com.liferay.portal.model.ExpandoTable fetchByPrimaryKey(
		long tableId) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByPrimaryKey(tableId);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findByClassNameId(
		long classNameId) throws com.liferay.portal.SystemException {
		return getPersistence().findByClassNameId(classNameId);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findByClassNameId(
		long classNameId, int begin, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByClassNameId(classNameId, begin, end);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findByClassNameId(
		long classNameId, int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByClassNameId(classNameId, begin, end, obc);
	}

	public static com.liferay.portal.model.ExpandoTable findByClassNameId_First(
		long classNameId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().findByClassNameId_First(classNameId, obc);
	}

	public static com.liferay.portal.model.ExpandoTable findByClassNameId_Last(
		long classNameId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().findByClassNameId_Last(classNameId, obc);
	}

	public static com.liferay.portal.model.ExpandoTable[] findByClassNameId_PrevAndNext(
		long tableId, long classNameId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence()
				   .findByClassNameId_PrevAndNext(tableId, classNameId, obc);
	}

	public static com.liferay.portal.model.ExpandoTable findByC_N(
		long classNameId, java.lang.String name)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().findByC_N(classNameId, name);
	}

	public static com.liferay.portal.model.ExpandoTable fetchByC_N(
		long classNameId, java.lang.String name)
		throws com.liferay.portal.SystemException {
		return getPersistence().fetchByC_N(classNameId, name);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException {
		return getPersistence().findWithDynamicQuery(queryInitializer);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int begin, int end) throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findWithDynamicQuery(queryInitializer, begin, end);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findAll()
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll();
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findAll(
		int begin, int end) throws com.liferay.portal.SystemException {
		return getPersistence().findAll(begin, end);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoTable> findAll(
		int begin, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll(begin, end, obc);
	}

	public static void removeByClassNameId(long classNameId)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByClassNameId(classNameId);
	}

	public static void removeByC_N(long classNameId, java.lang.String name)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().removeByC_N(classNameId, name);
	}

	public static void removeAll() throws com.liferay.portal.SystemException {
		getPersistence().removeAll();
	}

	public static int countByClassNameId(long classNameId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByClassNameId(classNameId);
	}

	public static int countByC_N(long classNameId, java.lang.String name)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByC_N(classNameId, name);
	}

	public static int countAll() throws com.liferay.portal.SystemException {
		return getPersistence().countAll();
	}

	public static java.util.List<com.liferay.portal.model.ExpandoColumn> getExpandoColumns(
		long pk)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().getExpandoColumns(pk);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoColumn> getExpandoColumns(
		long pk, int begin, int end)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().getExpandoColumns(pk, begin, end);
	}

	public static java.util.List<com.liferay.portal.model.ExpandoColumn> getExpandoColumns(
		long pk, int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		return getPersistence().getExpandoColumns(pk, begin, end, obc);
	}

	public static int getExpandoColumnsSize(long pk)
		throws com.liferay.portal.SystemException {
		return getPersistence().getExpandoColumnsSize(pk);
	}

	public static boolean containsExpandoColumn(long pk, long expandoColumnPK)
		throws com.liferay.portal.SystemException {
		return getPersistence().containsExpandoColumn(pk, expandoColumnPK);
	}

	public static boolean containsExpandoColumns(long pk)
		throws com.liferay.portal.SystemException {
		return getPersistence().containsExpandoColumns(pk);
	}

	public static void addExpandoColumn(long pk, long expandoColumnPK)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().addExpandoColumn(pk, expandoColumnPK);
	}

	public static void addExpandoColumn(long pk,
		com.liferay.portal.model.ExpandoColumn expandoColumn)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().addExpandoColumn(pk, expandoColumn);
	}

	public static void addExpandoColumns(long pk, long[] expandoColumnPKs)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().addExpandoColumns(pk, expandoColumnPKs);
	}

	public static void addExpandoColumns(long pk,
		java.util.List<com.liferay.portal.model.ExpandoColumn> expandoColumns)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().addExpandoColumns(pk, expandoColumns);
	}

	public static void clearExpandoColumns(long pk)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().clearExpandoColumns(pk);
	}

	public static void removeExpandoColumn(long pk, long expandoColumnPK)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().removeExpandoColumn(pk, expandoColumnPK);
	}

	public static void removeExpandoColumn(long pk,
		com.liferay.portal.model.ExpandoColumn expandoColumn)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().removeExpandoColumn(pk, expandoColumn);
	}

	public static void removeExpandoColumns(long pk, long[] expandoColumnPKs)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().removeExpandoColumns(pk, expandoColumnPKs);
	}

	public static void removeExpandoColumns(long pk,
		java.util.List<com.liferay.portal.model.ExpandoColumn> expandoColumns)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().removeExpandoColumns(pk, expandoColumns);
	}

	public static void setExpandoColumns(long pk, long[] expandoColumnPKs)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().setExpandoColumns(pk, expandoColumnPKs);
	}

	public static void setExpandoColumns(long pk,
		java.util.List<com.liferay.portal.model.ExpandoColumn> expandoColumns)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.NoSuchExpandoColumnException,
			com.liferay.portal.NoSuchExpandoTableException {
		getPersistence().setExpandoColumns(pk, expandoColumns);
	}

	public static ExpandoTablePersistence getPersistence() {
		return _getUtil()._persistence;
	}

	public void setPersistence(ExpandoTablePersistence persistence) {
		_persistence = persistence;
	}

	private static ExpandoTableUtil _getUtil() {
		if (_util == null) {
			_util = (ExpandoTableUtil)com.liferay.portal.kernel.bean.BeanLocatorUtil.locate(_UTIL);
		}

		return _util;
	}

	private static final String _UTIL = ExpandoTableUtil.class.getName();
	private static ExpandoTableUtil _util;
	private ExpandoTablePersistence _persistence;
}