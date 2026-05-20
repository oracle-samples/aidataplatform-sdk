# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ValidateViewSqlDetails(object):
    """
    View select query details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ValidateViewSqlDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param view_select_query:
            The value to assign to the view_select_query property of this ValidateViewSqlDetails.
        :type view_select_query: str

        """
        self.swagger_types = {
            'view_select_query': 'str'
        }

        self.attribute_map = {
            'view_select_query': 'viewSelectQuery'
        }

        self._view_select_query = None

    @property
    def view_select_query(self):
        """
        **[Required]** Gets the view_select_query of this ValidateViewSqlDetails.
        The Query used to create the view.


        :return: The view_select_query of this ValidateViewSqlDetails.
        :rtype: str
        """
        return self._view_select_query

    @view_select_query.setter
    def view_select_query(self, view_select_query):
        """
        Sets the view_select_query of this ValidateViewSqlDetails.
        The Query used to create the view.


        :param view_select_query: The view_select_query of this ValidateViewSqlDetails.
        :type: str
        """
        self._view_select_query = view_select_query

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
