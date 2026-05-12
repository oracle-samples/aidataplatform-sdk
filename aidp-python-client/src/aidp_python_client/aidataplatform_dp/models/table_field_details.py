# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TableFieldDetails(object):
    """
    Columns for table.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TableFieldDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param field_name:
            The value to assign to the field_name property of this TableFieldDetails.
        :type field_name: str

        :param field_type:
            The value to assign to the field_type property of this TableFieldDetails.
        :type field_type: str

        :param field_precision:
            The value to assign to the field_precision property of this TableFieldDetails.
        :type field_precision: str

        :param field_scale:
            The value to assign to the field_scale property of this TableFieldDetails.
        :type field_scale: str

        :param field_description:
            The value to assign to the field_description property of this TableFieldDetails.
        :type field_description: str

        """
        self.swagger_types = {
            'field_name': 'str',
            'field_type': 'str',
            'field_precision': 'str',
            'field_scale': 'str',
            'field_description': 'str'
        }

        self.attribute_map = {
            'field_name': 'fieldName',
            'field_type': 'fieldType',
            'field_precision': 'fieldPrecision',
            'field_scale': 'fieldScale',
            'field_description': 'fieldDescription'
        }

        self._field_name = None
        self._field_type = None
        self._field_precision = None
        self._field_scale = None
        self._field_description = None

    @property
    def field_name(self):
        """
        **[Required]** Gets the field_name of this TableFieldDetails.
        Name of the column.


        :return: The field_name of this TableFieldDetails.
        :rtype: str
        """
        return self._field_name

    @field_name.setter
    def field_name(self, field_name):
        """
        Sets the field_name of this TableFieldDetails.
        Name of the column.


        :param field_name: The field_name of this TableFieldDetails.
        :type: str
        """
        self._field_name = field_name

    @property
    def field_type(self):
        """
        Gets the field_type of this TableFieldDetails.
        Type of the column.


        :return: The field_type of this TableFieldDetails.
        :rtype: str
        """
        return self._field_type

    @field_type.setter
    def field_type(self, field_type):
        """
        Sets the field_type of this TableFieldDetails.
        Type of the column.


        :param field_type: The field_type of this TableFieldDetails.
        :type: str
        """
        self._field_type = field_type

    @property
    def field_precision(self):
        """
        Gets the field_precision of this TableFieldDetails.
        Precision of the column.


        :return: The field_precision of this TableFieldDetails.
        :rtype: str
        """
        return self._field_precision

    @field_precision.setter
    def field_precision(self, field_precision):
        """
        Sets the field_precision of this TableFieldDetails.
        Precision of the column.


        :param field_precision: The field_precision of this TableFieldDetails.
        :type: str
        """
        self._field_precision = field_precision

    @property
    def field_scale(self):
        """
        Gets the field_scale of this TableFieldDetails.
        Scale of the column.


        :return: The field_scale of this TableFieldDetails.
        :rtype: str
        """
        return self._field_scale

    @field_scale.setter
    def field_scale(self, field_scale):
        """
        Sets the field_scale of this TableFieldDetails.
        Scale of the column.


        :param field_scale: The field_scale of this TableFieldDetails.
        :type: str
        """
        self._field_scale = field_scale

    @property
    def field_description(self):
        """
        Gets the field_description of this TableFieldDetails.
        Description of the column.


        :return: The field_description of this TableFieldDetails.
        :rtype: str
        """
        return self._field_description

    @field_description.setter
    def field_description(self, field_description):
        """
        Sets the field_description of this TableFieldDetails.
        Description of the column.


        :param field_description: The field_description of this TableFieldDetails.
        :type: str
        """
        self._field_description = field_description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
