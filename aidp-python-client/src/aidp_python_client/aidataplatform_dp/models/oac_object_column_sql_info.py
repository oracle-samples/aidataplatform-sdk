# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacObjectColumnSqlInfo(object):
    """
    SQL metadata for a column in an OAC data object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacObjectColumnSqlInfo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agg_rule:
            The value to assign to the agg_rule property of this OacObjectColumnSqlInfo.
        :type agg_rule: str

        :param data_type:
            The value to assign to the data_type property of this OacObjectColumnSqlInfo.
        :type data_type: str

        :param agg_type:
            The value to assign to the agg_type property of this OacObjectColumnSqlInfo.
        :type agg_type: str

        """
        self.swagger_types = {
            'agg_rule': 'str',
            'data_type': 'str',
            'agg_type': 'str'
        }

        self.attribute_map = {
            'agg_rule': 'aggRule',
            'data_type': 'dataType',
            'agg_type': 'aggType'
        }

        self._agg_rule = None
        self._data_type = None
        self._agg_type = None

    @property
    def agg_rule(self):
        """
        Gets the agg_rule of this OacObjectColumnSqlInfo.
        The aggregation rule for the column in the OAC data object.


        :return: The agg_rule of this OacObjectColumnSqlInfo.
        :rtype: str
        """
        return self._agg_rule

    @agg_rule.setter
    def agg_rule(self, agg_rule):
        """
        Sets the agg_rule of this OacObjectColumnSqlInfo.
        The aggregation rule for the column in the OAC data object.


        :param agg_rule: The agg_rule of this OacObjectColumnSqlInfo.
        :type: str
        """
        self._agg_rule = agg_rule

    @property
    def data_type(self):
        """
        Gets the data_type of this OacObjectColumnSqlInfo.
        The data type for the column in the OAC data object.


        :return: The data_type of this OacObjectColumnSqlInfo.
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """
        Sets the data_type of this OacObjectColumnSqlInfo.
        The data type for the column in the OAC data object.


        :param data_type: The data_type of this OacObjectColumnSqlInfo.
        :type: str
        """
        self._data_type = data_type

    @property
    def agg_type(self):
        """
        Gets the agg_type of this OacObjectColumnSqlInfo.
        The aggregation type for the column in the OAC data object.


        :return: The agg_type of this OacObjectColumnSqlInfo.
        :rtype: str
        """
        return self._agg_type

    @agg_type.setter
    def agg_type(self, agg_type):
        """
        Sets the agg_type of this OacObjectColumnSqlInfo.
        The aggregation type for the column in the OAC data object.


        :param agg_type: The agg_type of this OacObjectColumnSqlInfo.
        :type: str
        """
        self._agg_type = agg_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
