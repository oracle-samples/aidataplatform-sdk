# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpResult(object):
    """
    Generated text info for mcp result.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new McpResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param data:
            The value to assign to the data property of this McpResult.
        :type data: str

        """
        self.swagger_types = {
            'data': 'str'
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = None

    @property
    def data(self):
        """
        **[Required]** Gets the data of this McpResult.
        The generated content from the mcp.


        :return: The data of this McpResult.
        :rtype: str
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this McpResult.
        The generated content from the mcp.


        :param data: The data of this McpResult.
        :type: str
        """
        self._data = data

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
