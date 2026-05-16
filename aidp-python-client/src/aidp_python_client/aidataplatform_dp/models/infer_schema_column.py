# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferSchemaColumn(object):
    """
    Column inferred from location.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferSchemaColumn object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param field_name:
            The value to assign to the field_name property of this InferSchemaColumn.
        :type field_name: str

        :param field_type:
            The value to assign to the field_type property of this InferSchemaColumn.
        :type field_type: str

        :param is_partition:
            The value to assign to the is_partition property of this InferSchemaColumn.
        :type is_partition: bool

        :param rank:
            The value to assign to the rank property of this InferSchemaColumn.
        :type rank: int

        """
        self.swagger_types = {
            'field_name': 'str',
            'field_type': 'str',
            'is_partition': 'bool',
            'rank': 'int'
        }

        self.attribute_map = {
            'field_name': 'fieldName',
            'field_type': 'fieldType',
            'is_partition': 'isPartition',
            'rank': 'rank'
        }

        self._field_name = None
        self._field_type = None
        self._is_partition = None
        self._rank = None

    @property
    def field_name(self):
        """
        Gets the field_name of this InferSchemaColumn.
        Name of the column.


        :return: The field_name of this InferSchemaColumn.
        :rtype: str
        """
        return self._field_name

    @field_name.setter
    def field_name(self, field_name):
        """
        Sets the field_name of this InferSchemaColumn.
        Name of the column.


        :param field_name: The field_name of this InferSchemaColumn.
        :type: str
        """
        self._field_name = field_name

    @property
    def field_type(self):
        """
        Gets the field_type of this InferSchemaColumn.
        Type of the column.


        :return: The field_type of this InferSchemaColumn.
        :rtype: str
        """
        return self._field_type

    @field_type.setter
    def field_type(self, field_type):
        """
        Sets the field_type of this InferSchemaColumn.
        Type of the column.


        :param field_type: The field_type of this InferSchemaColumn.
        :type: str
        """
        self._field_type = field_type

    @property
    def is_partition(self):
        """
        Gets the is_partition of this InferSchemaColumn.
        Boolean value indicating if this column is partition column.


        :return: The is_partition of this InferSchemaColumn.
        :rtype: bool
        """
        return self._is_partition

    @is_partition.setter
    def is_partition(self, is_partition):
        """
        Sets the is_partition of this InferSchemaColumn.
        Boolean value indicating if this column is partition column.


        :param is_partition: The is_partition of this InferSchemaColumn.
        :type: bool
        """
        self._is_partition = is_partition

    @property
    def rank(self):
        """
        Gets the rank of this InferSchemaColumn.
        For partition columns rank value indicates level, for non-partition column the value will be zero.


        :return: The rank of this InferSchemaColumn.
        :rtype: int
        """
        return self._rank

    @rank.setter
    def rank(self, rank):
        """
        Sets the rank of this InferSchemaColumn.
        For partition columns rank value indicates level, for non-partition column the value will be zero.


        :param rank: The rank of this InferSchemaColumn.
        :type: int
        """
        self._rank = rank

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
