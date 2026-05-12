# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ViewSqlParseDetails(object):
    """
    Parsed view select query post validation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ViewSqlParseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_query_valid:
            The value to assign to the is_query_valid property of this ViewSqlParseDetails.
        :type is_query_valid: bool

        :param query_parse_error_message:
            The value to assign to the query_parse_error_message property of this ViewSqlParseDetails.
        :type query_parse_error_message: str

        :param view_fields:
            The value to assign to the view_fields property of this ViewSqlParseDetails.
        :type view_fields: list[oci.aidataplatform_dp.models.ViewFieldDetails]

        """
        self.swagger_types = {
            'is_query_valid': 'bool',
            'query_parse_error_message': 'str',
            'view_fields': 'list[ViewFieldDetails]'
        }

        self.attribute_map = {
            'is_query_valid': 'isQueryValid',
            'query_parse_error_message': 'queryParseErrorMessage',
            'view_fields': 'viewFields'
        }

        self._is_query_valid = None
        self._query_parse_error_message = None
        self._view_fields = None

    @property
    def is_query_valid(self):
        """
        **[Required]** Gets the is_query_valid of this ViewSqlParseDetails.
        Flag to indicate whether given view SQL is valid or not.


        :return: The is_query_valid of this ViewSqlParseDetails.
        :rtype: bool
        """
        return self._is_query_valid

    @is_query_valid.setter
    def is_query_valid(self, is_query_valid):
        """
        Sets the is_query_valid of this ViewSqlParseDetails.
        Flag to indicate whether given view SQL is valid or not.


        :param is_query_valid: The is_query_valid of this ViewSqlParseDetails.
        :type: bool
        """
        self._is_query_valid = is_query_valid

    @property
    def query_parse_error_message(self):
        """
        Gets the query_parse_error_message of this ViewSqlParseDetails.
        Error message if given view SQL is not valid.


        :return: The query_parse_error_message of this ViewSqlParseDetails.
        :rtype: str
        """
        return self._query_parse_error_message

    @query_parse_error_message.setter
    def query_parse_error_message(self, query_parse_error_message):
        """
        Sets the query_parse_error_message of this ViewSqlParseDetails.
        Error message if given view SQL is not valid.


        :param query_parse_error_message: The query_parse_error_message of this ViewSqlParseDetails.
        :type: str
        """
        self._query_parse_error_message = query_parse_error_message

    @property
    def view_fields(self):
        """
        Gets the view_fields of this ViewSqlParseDetails.
        Columns for view.


        :return: The view_fields of this ViewSqlParseDetails.
        :rtype: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        return self._view_fields

    @view_fields.setter
    def view_fields(self, view_fields):
        """
        Sets the view_fields of this ViewSqlParseDetails.
        Columns for view.


        :param view_fields: The view_fields of this ViewSqlParseDetails.
        :type: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        self._view_fields = view_fields

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
