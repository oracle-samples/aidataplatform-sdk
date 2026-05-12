# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ListFilter(object):
    """
    List filters
    """

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "TYPE"
    FIELD_TYPE = "TYPE"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "OWNER"
    FIELD_OWNER = "OWNER"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "CREATED_BY"
    FIELD_CREATED_BY = "CREATED_BY"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "CATALOG"
    FIELD_CATALOG = "CATALOG"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "SCHEMA"
    FIELD_SCHEMA = "SCHEMA"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "WORKSPACE"
    FIELD_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "JOB"
    FIELD_JOB = "JOB"

    #: A constant which can be used with the field property of a ListFilter.
    #: This constant has a value of "CLUSTER"
    FIELD_CLUSTER = "CLUSTER"

    #: A constant which can be used with the data_type property of a ListFilter.
    #: This constant has a value of "STRING"
    DATA_TYPE_STRING = "STRING"

    #: A constant which can be used with the data_type property of a ListFilter.
    #: This constant has a value of "DATE"
    DATA_TYPE_DATE = "DATE"

    #: A constant which can be used with the data_type property of a ListFilter.
    #: This constant has a value of "INTEGER"
    DATA_TYPE_INTEGER = "INTEGER"

    def __init__(self, **kwargs):
        """
        Initializes a new ListFilter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param field:
            The value to assign to the field property of this ListFilter.
            Allowed values for this property are: "TYPE", "OWNER", "CREATED_BY", "CATALOG", "SCHEMA", "WORKSPACE", "JOB", "CLUSTER"
        :type field: str

        :param data_type:
            The value to assign to the data_type property of this ListFilter.
            Allowed values for this property are: "STRING", "DATE", "INTEGER"
        :type data_type: str

        :param values:
            The value to assign to the values property of this ListFilter.
        :type values: list[str]

        """
        self.swagger_types = {
            'field': 'str',
            'data_type': 'str',
            'values': 'list[str]'
        }

        self.attribute_map = {
            'field': 'field',
            'data_type': 'dataType',
            'values': 'values'
        }

        self._field = None
        self._data_type = None
        self._values = None

    @property
    def field(self):
        """
        Gets the field of this ListFilter.
        Field Name for term filter

        Allowed values for this property are: "TYPE", "OWNER", "CREATED_BY", "CATALOG", "SCHEMA", "WORKSPACE", "JOB", "CLUSTER"


        :return: The field of this ListFilter.
        :rtype: str
        """
        return self._field

    @field.setter
    def field(self, field):
        """
        Sets the field of this ListFilter.
        Field Name for term filter


        :param field: The field of this ListFilter.
        :type: str
        """
        allowed_values = ["TYPE", "OWNER", "CREATED_BY", "CATALOG", "SCHEMA", "WORKSPACE", "JOB", "CLUSTER"]
        if not value_allowed_none_or_none_sentinel(field, allowed_values):
            raise ValueError(
                "Invalid value for `field`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._field = field

    @property
    def data_type(self):
        """
        Gets the data_type of this ListFilter.
        Field Name data type

        Allowed values for this property are: "STRING", "DATE", "INTEGER"


        :return: The data_type of this ListFilter.
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """
        Sets the data_type of this ListFilter.
        Field Name data type


        :param data_type: The data_type of this ListFilter.
        :type: str
        """
        allowed_values = ["STRING", "DATE", "INTEGER"]
        if not value_allowed_none_or_none_sentinel(data_type, allowed_values):
            raise ValueError(
                "Invalid value for `data_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._data_type = data_type

    @property
    def values(self):
        """
        Gets the values of this ListFilter.
        List of values


        :return: The values of this ListFilter.
        :rtype: list[str]
        """
        return self._values

    @values.setter
    def values(self, values):
        """
        Sets the values of this ListFilter.
        List of values


        :param values: The values of this ListFilter.
        :type: list[str]
        """
        self._values = values

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
