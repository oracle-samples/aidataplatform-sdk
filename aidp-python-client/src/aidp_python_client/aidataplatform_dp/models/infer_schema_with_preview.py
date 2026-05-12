# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferSchemaWithPreview(object):
    """
    Inferred schema and data.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferSchemaWithPreview object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param schema:
            The value to assign to the schema property of this InferSchemaWithPreview.
        :type schema: list[oci.aidataplatform_dp.models.InferSchemaColumn]

        :param data:
            The value to assign to the data property of this InferSchemaWithPreview.
        :type data: list[dict(str, str)]

        """
        self.swagger_types = {
            'schema': 'list[InferSchemaColumn]',
            'data': 'list[dict(str, str)]'
        }

        self.attribute_map = {
            'schema': 'schema',
            'data': 'data'
        }

        self._schema = None
        self._data = None

    @property
    def schema(self):
        """
        **[Required]** Gets the schema of this InferSchemaWithPreview.
        Column information obtained by inferring schema.


        :return: The schema of this InferSchemaWithPreview.
        :rtype: list[oci.aidataplatform_dp.models.InferSchemaColumn]
        """
        return self._schema

    @schema.setter
    def schema(self, schema):
        """
        Sets the schema of this InferSchemaWithPreview.
        Column information obtained by inferring schema.


        :param schema: The schema of this InferSchemaWithPreview.
        :type: list[oci.aidataplatform_dp.models.InferSchemaColumn]
        """
        self._schema = schema

    @property
    def data(self):
        """
        **[Required]** Gets the data of this InferSchemaWithPreview.
        Sample preview data.


        :return: The data of this InferSchemaWithPreview.
        :rtype: list[dict(str, str)]
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this InferSchemaWithPreview.
        Sample preview data.


        :param data: The data of this InferSchemaWithPreview.
        :type: list[dict(str, str)]
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
