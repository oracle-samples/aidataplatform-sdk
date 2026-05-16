# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SqlResult(object):
    """
    Rows for SQL result.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SqlResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param rows:
            The value to assign to the rows property of this SqlResult.
        :type rows: list[dict(str, str)]

        """
        self.swagger_types = {
            'rows': 'list[dict(str, str)]'
        }

        self.attribute_map = {
            'rows': 'rows'
        }

        self._rows = None

    @property
    def rows(self):
        """
        Gets the rows of this SqlResult.
        Array of result rows with dynamic columns.


        :return: The rows of this SqlResult.
        :rtype: list[dict(str, str)]
        """
        return self._rows

    @rows.setter
    def rows(self, rows):
        """
        Sets the rows of this SqlResult.
        Array of result rows with dynamic columns.


        :param rows: The rows of this SqlResult.
        :type: list[dict(str, str)]
        """
        self._rows = rows

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
