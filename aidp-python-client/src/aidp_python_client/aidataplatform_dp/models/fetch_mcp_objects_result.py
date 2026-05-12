# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchMcpObjectsResult(object):
    """
    Response for a list tools call
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FetchMcpObjectsResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param objects:
            The value to assign to the objects property of this FetchMcpObjectsResult.
        :type objects: list[oci.aidataplatform_dp.models.McpObject]

        :param next_page:
            The value to assign to the next_page property of this FetchMcpObjectsResult.
        :type next_page: str

        :param previous_page:
            The value to assign to the previous_page property of this FetchMcpObjectsResult.
        :type previous_page: str

        :param total_items:
            The value to assign to the total_items property of this FetchMcpObjectsResult.
        :type total_items: int

        """
        self.swagger_types = {
            'objects': 'list[McpObject]',
            'next_page': 'str',
            'previous_page': 'str',
            'total_items': 'int'
        }

        self.attribute_map = {
            'objects': 'objects',
            'next_page': 'nextPage',
            'previous_page': 'previousPage',
            'total_items': 'totalItems'
        }

        self._objects = None
        self._next_page = None
        self._previous_page = None
        self._total_items = None

    @property
    def objects(self):
        """
        Gets the objects of this FetchMcpObjectsResult.
        The list of objects to be returned.


        :return: The objects of this FetchMcpObjectsResult.
        :rtype: list[oci.aidataplatform_dp.models.McpObject]
        """
        return self._objects

    @objects.setter
    def objects(self, objects):
        """
        Sets the objects of this FetchMcpObjectsResult.
        The list of objects to be returned.


        :param objects: The objects of this FetchMcpObjectsResult.
        :type: list[oci.aidataplatform_dp.models.McpObject]
        """
        self._objects = objects

    @property
    def next_page(self):
        """
        Gets the next_page of this FetchMcpObjectsResult.
        For list pagination. When this header appears in the response, additional pages of results remain. For
        important details about how pagination works, see `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :return: The next_page of this FetchMcpObjectsResult.
        :rtype: str
        """
        return self._next_page

    @next_page.setter
    def next_page(self, next_page):
        """
        Sets the next_page of this FetchMcpObjectsResult.
        For list pagination. When this header appears in the response, additional pages of results remain. For
        important details about how pagination works, see `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :param next_page: The next_page of this FetchMcpObjectsResult.
        :type: str
        """
        self._next_page = next_page

    @property
    def previous_page(self):
        """
        Gets the previous_page of this FetchMcpObjectsResult.
        For list pagination. When this header appears in the response, previous pages of results remain. For
        important details about how pagination works, see `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :return: The previous_page of this FetchMcpObjectsResult.
        :rtype: str
        """
        return self._previous_page

    @previous_page.setter
    def previous_page(self, previous_page):
        """
        Sets the previous_page of this FetchMcpObjectsResult.
        For list pagination. When this header appears in the response, previous pages of results remain. For
        important details about how pagination works, see `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :param previous_page: The previous_page of this FetchMcpObjectsResult.
        :type: str
        """
        self._previous_page = previous_page

    @property
    def total_items(self):
        """
        Gets the total_items of this FetchMcpObjectsResult.
        For list pagination. This header provides total number of items available. For
        important details about how pagination works, see `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :return: The total_items of this FetchMcpObjectsResult.
        :rtype: int
        """
        return self._total_items

    @total_items.setter
    def total_items(self, total_items):
        """
        Sets the total_items of this FetchMcpObjectsResult.
        For list pagination. This header provides total number of items available. For
        important details about how pagination works, see `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :param total_items: The total_items of this FetchMcpObjectsResult.
        :type: int
        """
        self._total_items = total_items

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
